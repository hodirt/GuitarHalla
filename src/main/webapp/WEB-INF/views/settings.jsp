<%-- 
    Document   : settings
    Created on : 25.03.2016, 18:45:34
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Page</title>
    </head>
    <body>
        <form>
            <table>
                <tr>
                    <td>First Name (Login)</td>
                    <td>${user.getFirstName()}</td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>${user.getLastName()}</td>
                </tr>
            </table>
        </form>
    </body>
</html>
