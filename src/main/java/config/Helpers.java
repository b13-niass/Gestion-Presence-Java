package config;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class Helpers {
    Set<String> allowedPaths1;
    Set<String> allowedPaths2;
    Map<String, String> myCSS;

    public Helpers() {
        this.allowedPaths1 = Set.of("/ref","/app","/pro","/pre");
        this.allowedPaths2 = Set.of("/ref/","/app/","/pro/","/pre/");
        this.myCSS = Map.ofEntries(
                entry("/ref/liste", "list_referentiels"),
                entry("/ref/add", "list_referentiels"),
                entry("/app/liste", "list_apprenants"),
                entry("/app/add", "list_apprenants"),
                entry("/pre/liste", "list_presences"),
                entry("/pre/add", "list_presences"),
                entry("/pro/liste", "list_promos"),
                entry("/pro/add1", "create_promo_1"),
                entry("/pro/add2", "create_promo_2")
        );
    }

    public String getPageToInclude(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String uriWithoutContextPath = requestURI.substring(contextPath.length());
        if (allowedPaths1.contains(uriWithoutContextPath)) {
            uriWithoutContextPath += "/liste";
        }
        if (allowedPaths2.contains(uriWithoutContextPath)) {
            uriWithoutContextPath += "liste";
        }
        return "templates" + uriWithoutContextPath + ".jsp";
    }

    public String getCssToInclude(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String uriWithoutContextPath = requestURI.substring(contextPath.length());
        if (allowedPaths1.contains(uriWithoutContextPath)) {
            uriWithoutContextPath += "/liste";
        }
        if (allowedPaths2.contains(uriWithoutContextPath)) {
            uriWithoutContextPath += "liste";
        }
        return this.myCSS.get(uriWithoutContextPath);
//        return uriWithoutContextPath;
    }

//    public String identifyCSS(String part) {
//
//    }


}
