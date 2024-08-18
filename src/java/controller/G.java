package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class G extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //when we pass the false value in to getSession method's parameter, the web container do not create a new cookie or session object.
        //if exsisting session object id and cookie id (JSESSION) doen't match , it's not creating new one 
        //but the seesion object id and cookie id match it's allow to the process
        HttpSession session = req.getSession(false);
        resp.getWriter().write(session.getId());
    }
    
}
