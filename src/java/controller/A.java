package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //getParameter(String name)
        String name = req.getParameter("name");
        System.out.println(name);
        
        PrintWriter printWriter=resp.getWriter();
        printWriter.write("Thank you");
        //resp.getWriter().write("Thank you");
    }

}
