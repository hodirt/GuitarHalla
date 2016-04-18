<%-- 
    Document   : bassGuitars
    Created on : 18.04.2016, 18:02:24
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
        <title>Bass Guitars</title>
    </head>
    <body>
        <table>
            <c:forEach var="g" items="${bassGuitars}">
                <tr>
                    <td><c:url value="/bassGuitars/${g.id}" var="url"/>
                        <a href="${url}">${g.name}</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

