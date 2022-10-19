<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose Tag</title>
</head>
<body>

    <%
        request.setAttribute("number",3);

    %>

    <c:choose>
        <c:when test="${number == 1}">Monday</c:when>
        <c:when test="${number == 2}">Tuesday</c:when>
        <c:when test="${number == 3}">Wednesday</c:when>
        <c:when test="${number == 4}">Thursday</c:when>
        <c:when test="${number == 5}">Friday</c:when>
        <c:when test="${number == 6}">Saturday</c:when>
        <c:when test="${number == 7}">Sunday</c:when>

        <c:otherwise>Oops Something Wrong</c:otherwise>

    </c:choose>

</body>
</html>
