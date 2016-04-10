<%-- 
    Document   : particularGuitar
    Created on : 30.03.2016, 12:34:32
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guitar</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Name:</td>
                <td>${guitar.name}</td>
            </tr>
            <tr>
                <td>Firm:</td>
                <td>${guitar.firm}</td>
            </tr>
            <tr>
                <td>Color:</td>
                <td>${guitar.color}</td>
            </tr>
        </table>
    </body>
</html>
