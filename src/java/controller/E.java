package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class E extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //this create a cookie regarding this session and this cookie will destroy after the browser close(default).
        //creating a HttpSession object 
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        
    }

}
