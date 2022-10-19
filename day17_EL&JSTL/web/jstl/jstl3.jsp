<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Foreach Tag</title>
</head>
<body>

    <%
        List list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        request.setAttribute("list",list);
    %>

    <c:forEach begin="1" end="10" var="i" step="1" varStatus="s">
        ${i} <br>
        <h1>${s.index}</h1> <br>
        <h4>${s.count}</h4> <br>

    </c:forEach>

    <c:forEach items="${list}" var="str" varStatus="s">

        ${s.index} ${s.count} ${str} <br>
    </c:forEach>
</body>
</html>
