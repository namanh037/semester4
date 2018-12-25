<%-- 
    Document   : result
    Created on : Dec 12, 2018, 8:26:19 PM
    Author     : HP
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping!</title>
    </head>
    <body>
        <h1>List Product</h1>
        <a href="search.jsp">Search</a>
        <jsp:useBean class="com.wpsj.model.ProductFinderBean" id="finder" scope="request"/>

        <table>
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Description</td>
            </tr>
            <c:choose >
                <c:when test="${finder.products.size() == 0}">
                    <h1>Danh sachs rong</h1>
                </c:when>
                <c:otherwise>
                    <c:forEach items="${finder.products}" var="product" >
                        <tr>
                            <td><c:out value="${product.id}"/></td>
                            <td><c:out value="${product.name}"/></td>
                            <td><c:out value="${product.descs}"/></td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>


        </table>
    </body>
</html>
