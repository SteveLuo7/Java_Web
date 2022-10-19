<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/7
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


  <H1><%= request.getSession().getAttribute("user")%>,欢迎您</H1>
</body>
</html>
