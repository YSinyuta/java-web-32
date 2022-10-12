package controllers;

import database.DBServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "LoginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = req.getParameter("role");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login == null || login.equals("") || password == null || password.equals("")) {
            req.setAttribute("Error", 1);
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        }

        DBServices services = new DBServices();

        if (services.canLogin(login, password, role)) {
            req.getSession().setAttribute("isLogin", true);
            req.getSession().setAttribute("role", role);//1 3 2
            req.getSession().setAttribute("login", login);
            resp.sendRedirect("/");
        } else {
            req.setAttribute("Error", 2);
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        }
    }
}

