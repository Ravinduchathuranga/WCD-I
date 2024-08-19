package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class K extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session=req.getSession();
//        resp.getWriter().write(session.getAttribute("name").toString());

        ServletContext sccc = req.getServletContext();
        resp.getWriter().write(sccc.getAttribute("id").toString());
    }

}
