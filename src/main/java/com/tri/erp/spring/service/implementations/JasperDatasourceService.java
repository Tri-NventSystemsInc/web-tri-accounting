package com.tri.erp.spring.service.implementations;

import java.util.ArrayList;
import java.util.List;

import com.tri.erp.spring.repo.AccountRepo;
import com.tri.erp.spring.reponse.CoaPrintDto;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JasperDatasourceService {

	@Autowired
	private AccountRepo accountRepo;
	
	/**
	 * Returns a data source that's wrapped within {@link JRDataSource}
	 * @return
	 */
	public JRDataSource getDataSource() {
		List<CoaPrintDto> dtos = new ArrayList<>();

        CoaPrintDto c1 = new CoaPrintDto();
        c1.setTitle("Test");

        dtos.add(c1);

		// Return wrapped collection
		return new JRBeanCollectionDataSource(dtos);
	}
}