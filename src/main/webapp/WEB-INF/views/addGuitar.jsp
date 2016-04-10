<%-- 
    Document   : addGuitar
    Created on : 01.04.2016, 9:36:36
    Author     : home
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Guitar</title>
    </head>
    <body>
        <table>
            <f:form method="POST" modelAttribute="guitar">
                <tr>
                    <th>Name of guitar:</th>
                    <td><f:input path="name"/></td>
                    <td><f:errors path="name"/></td>
                </tr>
                <tr>
                    <th>Firm:</th>
                    <td><f:select path="firm">
                            <c:forEach var="f" items="${firms}">
                                <f:option value="${f.id}">
                                    ${f.firm}
                                </f:option>
                            </c:forEach>
                        </f:select></td>
                    <td><f:errors path="firm"/></td>
                </tr>
                <tr>
                    <th>Type:</th>
                    <td><f:select path="type">
                            <c:forEach var="g" items="${guitarTypes}">
                                <f:option value="${g.id}">
                                    ${g.guitarType}
                                </f:option>
                            </c:forEach>
                        </f:select></td>
                    <td><f:errors path="type"/></td>
                </tr>
                <tr>
                    <th>Number of frets:</th>
                    <td><f:input path="numberOfFrets"/></td>
                    <td><f:errors path="numberOfFrets"/></td>
                </tr>
                <tr>
                    <th>Number of strings</th>
                    <td><f:input path="numberOfStrings"/></td>
                    <td><f:errors path="numberOfStrings"/></td>
                </tr>
                <tr>
                    <th>Pickups</th>
                    <td><f:input path="pickups"/></td>
                    <td><f:errors path="pickups"/></td>
                </tr>
                <tr>
                    <th>Tree of fingerbar</th>
                    <td><f:select path="treeOfFingerbar">
                            <c:forEach var="t" items="${tree}">
                                <f:option value="${t.id}">
                                    ${t.treeType}
                                </f:option>
                            </c:forEach>
                        </f:select></td>
                    <td><f:errors path="treeOfFingerbar"/></td>
                </tr>
                <tr>
                    <th>Tree of main part</th>
                    <td><f:select path="treeOfMainPart">
                            <c:forEach var="t" items="${tree}">
                                <f:option value="${t.id}">
                                    ${t.treeType}
                                </f:option>
                            </c:forEach>
                        </f:select></td>
                    <td><f:errors path="treeOfMainPart"/></td>
                </tr>
                <tr>
                    <th>Color</th>
                    <td><f:select path="color">
                            <c:forEach var="col" items="${colors}">
                                <f:option value="${col.id}">
                                    ${col.color}
                                </f:option>                    
                            </c:forEach>
                        </f:select></td>
                    <td><f:errors path="color"/></td>
                </tr>
                <tr>
                    <th>Price</th>
                    <td><f:input path="price"/></td>
                    <td><f:errors path="price"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="ADD"/></td>
                </tr>
            </f:form>
        </table>
    </body>
</html>
