<%-- 
    Document   : search
    Created on : Dec 12, 2018, 8:26:38 PM
    Author     : HP
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product List!</h1>
        <form action="ProductFinder">
            <span style="color: red;">
                <c:out value="${param.msg}"/></span>
                <input name="name"/><input type="submit"/>
        </form>
    </body>
</html>
