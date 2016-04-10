<%-- 
    Document   : registr
    Created on : 18.03.2016, 17:37:49
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <style>
            f:errors {color:red;}
        </style>
    </head>
    <body>
        <h1>Register</h1>
        <table>
            <f:form method="POST" modelAttribute="customer">
            <tr>
                <th>Enter your first name:</th>
                <td><f:input path="firstName"/></td>
                <td><f:errors path="firstName"/></td>
            </tr>
            <tr>
                <th>Enter your last name:</th>
                <td><f:input path="lastName"/></td>
                <td><f:errors path="lastName"/></td>
            </tr>
            <tr>
                <th>Enter your password:</th>
                <td><f:input path="password"/></td>
                <td><f:errors path="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="OK"/></td>
            </tr>
        </f:form>

    </table>
</body>
</html>
