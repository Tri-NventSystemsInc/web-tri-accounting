package com.tri.erp.spring.commons.helpers;

import com.tri.erp.spring.commons.GlobalConstant;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by TSI Admin on 10/7/2014.
 */
public class ReportUtil {
    public static HashMap setupSharedReportHeaders(HttpServletRequest request) {

        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("COMP_NAME", "Your name");
        parameters.put("COMP_ADDRESS", "Your address");
        parameters.put("COMP_CONTACT", "Your contact");
        parameters.put("LOGO_PATH", request.getSession().getServletContext().getRealPath("/resources/images/"));

        return parameters;
    }

    public static HashMap setupSharedReportHeaders() {

        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("COMP_NAME", "Your name");
        parameters.put("COMP_ADDRESS", "Your address");
        parameters.put("COMP_CONTACT", "Your contact");

        return parameters;
    }
}
