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
    <title>el3</title>
</head>
<body>

    <%
        User user = new User();
        user.setName("Zhangsan");
        user.setAge(25);
        user.setBirthday(new Date());


        request.setAttribute("u",user);

        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(user);

        request.setAttribute("list",list);

        Map map = new HashMap<>();
        map.put("sname","Lisi");
        map.put("gender","male");
        map.put("user",user);

        request.setAttribute("map",map);

    %>

    <h3>el 获取对象</h3>

    ${requestScope.u} <br>
    ${requestScope.u.name} <br>
    ${requestScope.u.age} <br>
    ${requestScope.u.birthday} <br>
    ${requestScope.u.birthday.month} <br>
    ${requestScope.u.birStr} <br>

    <hr>

    ${list} <br>
    ${list[0]} <br>
    ${list[1]} <br>
    ${list[10]} <br>
    ${list[3].name} <br>

    <hr>

    ${map} <br>
    ${map.gender} <br>
    ${map["gender"]} <br>
    ${map.user.name} <br>
</body>
</html>
