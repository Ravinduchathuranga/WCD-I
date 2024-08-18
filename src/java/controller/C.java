package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class C extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //how to create a coockie 
        Cookie cookie = new Cookie("Ravindu", "Chathuranga");
        //set on response 
        response.addCookie(cookie);
        cookie.setMaxAge(0);
        

        response.getWriter().write("Hello page C");
    }

}
