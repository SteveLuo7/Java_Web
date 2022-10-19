<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/8
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    ${3 > 4}

    \${3 > 4}

<hr>

    <h1>算数运算符</h1>

    ${3 + 4} <br>
    ${3 / 4} <br>
    ${3 div 4} <br>
    ${3 % 4} <br>
    ${3 mod 4} <br>

<hr>

    <h1>比较运算符</h1>

    ${3 == 4}<br>

<hr>

    <h1>逻辑运算符</h1>

    ${3 > 4 && 3 < 4} <br>
    ${3 > 4 and 3 < 4} <br>

    <h4>empty</h4>

<%
    String str = "abc";
    request.setAttribute("str",str);


%>

    ${empty str} <br>



</body>
</html>
