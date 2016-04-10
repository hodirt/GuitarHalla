<%-- 
    Document   : electricGuitars
    Created on : 30.03.2016, 11:19:50
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
        <title>Electric Guitars</title>
    </head>
    <body>
        <table>
            <c:forEach var="g" items="${elGuitars}">
                <tr>
                    <td><c:url value="/electricGuitars/${g.id}" var="url"/>
                        <a href="${url}">${g.name}</a></td>
                </tr>
            </c:forEach>
        </table>
        <security:authorize
            access="isAuthenticated() and hasRole('ROLE_ADMIN')">
            <a href="addGuitar">Add Guitar</a>
        </security:authorize> 
    </body>
</html>
