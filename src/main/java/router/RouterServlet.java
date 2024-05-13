package router;

import config.Helpers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = {"/*"})
public class RouterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Helpers helpers = new Helpers();
//        String pathToInclude = helpers.getPageToInclude(req);
//        String cssToInclude = helpers.getCssToInclude(req);
//        String requestURI = req.getRequestURI();
//        String contextPath = req.getContextPath();
//        PrintWriter out = resp.getWriter();
//        out.println(requestURI.substring(contextPath.length()));
//        File file = new File(getServletContext().getRealPath(pathToInclude));
//        if (file.exists()) {
//            req.setAttribute("uriWithoutContextPath", pathToInclude);
//            req.setAttribute("cssToInclude", cssToInclude);
//            resp.sendRedirect(requestURI.substring(contextPath.length()));
//        } else {
//            req.getRequestDispatcher("/templates/error/404.jsp").forward(req, resp);
//        }
    }
}
