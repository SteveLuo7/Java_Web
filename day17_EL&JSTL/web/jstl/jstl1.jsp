<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if Tag</title>
</head>
<body>

    <c:if test="true">
        <h1>I am real</h1>
    </c:if>
    <br>

    <%
        List list = new ArrayList();
        list.add("aaa");
        request.setAttribute("list",list);
        request.setAttribute("number",3);

    %>

    <c:if test="${not empty list}">
        循环遍历
    </c:if>
    <br>

    <c:if test="${number % 2 != 0}">
        ${number} 为奇数
    </c:if>
    <br>

    <c:if test="${number % 2 == 0}">
        ${number} 偶数
    </c:if>
    <br>

</body>
</html>
