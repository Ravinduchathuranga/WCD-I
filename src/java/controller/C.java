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
        cookie.setMaxAge(60);
        //setting time to expaire cookie on browser
        //an integer specifying the maximum age of the cookie in seconds; 

        cookie.setMaxAge(0);
        //this destroy immidiatly a cookie
        //if zero, deletes the cookie

        cookie.setMaxAge(-1);
        //this destroy cookie on browser close 
        //if negative, means the cookie is not stored;

        response.getWriter().write("Hello page C");
    }

}
