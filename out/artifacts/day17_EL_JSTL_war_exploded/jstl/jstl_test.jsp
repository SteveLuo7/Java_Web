<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl_test</title>
</head>
<body>

    <%
        List list = new ArrayList<>();
        list.add(new User("Zhangsan",23,new Date()));
        list.add(new User("Lisi",24,new Date()));
        list.add(new User("Wangwu",25,new Date()));

        request.setAttribute("list",list);

    %>

    <table border="1" width="500" align="center">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>生日</th>
        </tr>

        <c:forEach items="${list}" var="user" varStatus="s">

            <c:if test="${s.count % 2 == 0}">

                <tr bgcolor="#ffb6c1">
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>${user.birStr}</td>
                </tr>
            </c:if>

            <c:if test="${s.count % 2 != 0}">

                <tr bgcolor="#9acd32">
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>${user.birStr}</td>
                </tr>
            </c:if>

        </c:forEach>

    </table>
</body>
</html>
