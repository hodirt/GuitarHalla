<%-- 
    Document   : securityTest
    Created on : 23.03.2016, 17:55:04
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>securityTest</title>
    </head>
    <body>
        <security:authorize
            access="isAuthenticated() and hasRole('ROLE_ADMIN')">
            For admin
        </security:authorize>
        <security:authorize access="!isAuthenticated()">
            For not logined
        </security:authorize>
        <security:authorize
            access="isAuthenticated() and principal.username!='${user.id}' and !hasRole('ROLE_ADMIN')">
           For logined and not owner of the page and not admin
        </security:authorize>
        <security:authorize
            access="isAuthenticated() and principal.username=='${user.id}'">
            For the owner of the page
        </security:authorize>
        <security:authorize access="hasRole('ROLE_CUSTOMER')">
            For customer
        </security:authorize>
    </body>
</html>
