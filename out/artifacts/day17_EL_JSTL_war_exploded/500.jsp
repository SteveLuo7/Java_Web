<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>服务器维护中！！！</h1>
    <%
        String message = exception.getMessage();
        out.print(message);
    %>
</body>
</html>
