<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>隐式对象</title>
</head>
<body>

    ${pageContext.request}
<h4>在jsp页面动态获取虚拟目录</h4>
    ${pageContext.request.contextPath}
</body>
</html>
