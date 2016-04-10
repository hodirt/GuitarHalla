<%-- 
    Document   : tree
    Created on : 14.03.2016, 13:48:31
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tree</title>
    </head>
    <body>
        <h1>Tree</h1>
        <form action="?${_csrf.parameterName}=${_csrf.token}" method="post">
            <input name="treeType"/>
            <input type="submit" value="record"/>
        </form>
        <table>
            <c:forEach var="t" items="${trees}">
                <tr>
                    <td>${t}</td>
                    <td><c:url value="/tree/${t.id}" var="url"/>
                        <a href="${url}">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
