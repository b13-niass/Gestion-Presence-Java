package servlets;

import config.Helpers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

@WebServlet(name = "promotion", urlPatterns = {"/pro/*", "/pro/", "/pro"})
public class PromotionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Helpers helpers = new Helpers();
        String pathToInclude = helpers.getPageToInclude(req);
        String cssToInclude = helpers.getCssToInclude(req);
        File file = new File(getServletContext().getRealPath(pathToInclude));
        if (file.exists()) {
            req.setAttribute("uriWithoutContextPath", pathToInclude);
            req.setAttribute("cssToInclude", cssToInclude);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/templates/error/404.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
