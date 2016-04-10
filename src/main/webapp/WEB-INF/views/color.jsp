<%-- 
    Document   : color
    Created on : 09.03.2016, 18:29:25
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Color</title>
    </head>
    <body>
        <h1>Color</h1>
        <form action="?${_csrf.parameterName}=${_csrf.token}" method = "post">
            <input name="color"/>
            <input type="submit" value="ok"/>            
        </form>
        <table>
            <c:forEach var="c" items="${colors}">
                <tr>
                    <td>${c}</td>
                    <td><c:url value="/color/${c.id}" var="url"/>
                            <a href="${url}">delete</a>
                    </td>
                </tr>           
            </c:forEach>
        </table>
        <form action="?${_csrf.parameterName}=${_csrf.token}" method="post">
            <select name="colorId">
                <c:forEach var="col" items="${colors}">
                    <option value="${col.id}">
                        ${col.color}
                    </option>                    
                </c:forEach>
            </select>
            <input type="submit" value="print"/>
        </form>
    </body>
</html>
