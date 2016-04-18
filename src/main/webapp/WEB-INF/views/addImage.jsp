<%-- 
    Document   : addImage
    Created on : 18.04.2016, 14:54:16
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Add image to created guitar
        <f:form action="?${_csrf.parameterName}=${_csrf.token}" enctype="multipart/form-data" method="POST">
            <input type="file" name="file"/>
            <input type="submit" name="Ok"/>
           
        </f:form>
    </body>
</html>
