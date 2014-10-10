package com.tri.erp.spring.service.implementations;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DownloadService {
	protected static Logger logger = Logger.getLogger("service");
	
	@Autowired
	private ExporterService exporter;
	
	@Autowired
	private TokenService tokenService;
	
	public void download(String type, String token,
                         HttpServletResponse response, HashMap<String, Object> params,
                         String template, JRDataSource dataSource) {
		 
		try {

			InputStream reportStream = this.getClass().getResourceAsStream(template);
			JasperDesign jd = JRXmlLoader.load(reportStream);
			JasperReport jr = JasperCompileManager.compileReport(jd);
			// Make sure to pass the JasperReport, report parameters, and data source
			JasperPrint jp = JasperFillManager.fillReport(jr, params, dataSource);
			// Create an output byte stream where data will be written
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			// Export report
			exporter.export(type, jp, response, baos);
			// Write to response stream
			write(token, response, baos);
		
		} catch (JRException jre) {
			logger.error("Unable to process download");
			throw new RuntimeException(jre);
		}
	}
	
	/**
	* Writes the report to the output stream
	*/
	private void write(String token, HttpServletResponse response,
			ByteArrayOutputStream baos) {
		 
		try {
			logger.debug(baos.size());
			
			// Retrieve output stream
			ServletOutputStream outputStream = response.getOutputStream();
			// Write to output stream
			baos.writeTo(outputStream);
			// Flush the stream
			outputStream.flush();
			
			// Remove download token
			tokenService.remove(token);
			
		} catch (Exception e) {
			logger.error("Unable to write report to the output stream");
			throw new RuntimeException(e);
		}
	}
}
