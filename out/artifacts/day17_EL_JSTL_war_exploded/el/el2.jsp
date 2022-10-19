<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域的数据</title>

</head>
<body>

    <%

        request.setAttribute("name","zhangsan");
        session.setAttribute("age","23");


    %>

    <h3>el获取值</h3>

    ${requestScope.name}
    ${sessionScope.age}
    ${name}

</body>
</html>
