<%-- 
    Document   : index
    Created on : Aug 18, 2024, 9:13:01 AM
    Author     : ravinduchathuranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        pageContext.getAttribute("x",pageContext.APPLICATION_SCOPE);
        pageContext.getAttribute("x",pageContext.SESSION_SCOPE);
        pageContext.getAttribute("x",pageContext.REQUEST_SCOPE);
        pageContext.getAttribute("x",pageContext.PAGE_SCOPE);
        %>
    </body>
</html>
