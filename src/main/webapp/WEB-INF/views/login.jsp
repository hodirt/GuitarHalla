<%-- 
    Document   : login
    Created on : 18.03.2016, 18:09:15
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="?${_csrf.parameterName}=${_csrf.token}" method="post">
            <input name="username"/>
            <input type="password" name="password"/>
            <input type="submit" value="login"/>
        </form>
        <form action="?${_csrf.parameterName}=${_csrf.token}" method="post">
            <input type="submit" value="logout"/>
        </form>
    </body>
</html>
