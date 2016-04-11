<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <style type="text/css">

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <f:form action="?${_csrf.parameterName}=${_csrf.token}" enctype="multipart/form-data" method="POST">
            <input type="file" name="file"/>
            <input type="submit" name="Ok"/>
           
        </f:form>
        <a href = "color">color</a>
        <a href = "tree">tree</a>
        <a href = "registr">registration</a>
        <a href = "login">login</a>
        <a href = "settings">myPage</a>
        <a href = "securityTest">securityTest</a>
        <a href = "electricGuitars">electricGuitars</a>
       
</body>
</html>