package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.SessionContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class J extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession sc = req.getSession();
//        sc.setAttribute("name", "ravindu");

        ServletContext scc = req.getServletContext();
        scc.setAttribute("id", "10");
    }

}
