package com.tri.erp.spring.commons.helpers;

import com.tri.erp.spring.commons.GlobalConstant;

/**
 * Created by TSI Admin on 9/11/2014.
 */
public class StringFormatter {

    public static String ucFirst(String text) {
        if (text.trim().length() == 0) {
            return text;
        } else {
            return text.substring(0, 1).toUpperCase() + text.substring(1);
        }
    }

    public static String buildAccountCode(String accountTypeCode, String groupCode,
                                          String GLAccount, String SLAccount,
                                          String auxAccount) {

        String dash = "-";
        String accountCode = accountTypeCode + groupCode + dash + GLAccount + dash
                + SLAccount + dash + auxAccount;
        return accountCode;
    }

    public static String removeBaseFromRoute(String route) {
        if (route != null) {
            int startIndex = route.indexOf("#") + 1;
            return route.substring(startIndex, route.length());
        } else {
            return "";
        }
    }

    public static String replaceRouteParamWithPlaceholder(String uri, String... params) {
        if (params.length > 0) {
            for (String p : params) {
                uri = uri.replace(p, GlobalConstant.ROUTE_PARAM_PLACEHOLDER);
            }
        }
        return uri;
    }
}
