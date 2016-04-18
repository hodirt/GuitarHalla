<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <style type="text/css">
            <%@include file='css/indexCss.css' %>
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <table>
            <security:authorize
                access="isAuthenticated() and hasRole('ROLE_ADMIN')">
            <tr>
                <td><div><a href = "color">color</a></div></td>
            </tr>
            <tr>
                <td><div><a href = "tree">tree</a></div></td>
            </tr>
            </security:authorize>
            <tr>   
                <td><div><a href = "registr">registration</a></div></td>
            </tr>
            <tr>
                <td><div><a href = "login">login</a></div></td>
            </tr>
            <tr>
                <td><div><a href = "settings">myPage</a></div></td>
            </tr>
            <tr>
                <td><div><a href = "securityTest">securityTest</a></div></td>
            </tr>
            <tr>
                <td><div><a href = "electricGuitars">electricGuitars</a></div></td>
            </tr>
            <tr>
                <td><div><a href = "bassGuitars">bassGuitars</a></div></td>
            </tr>
        </table>
</body>
</html>