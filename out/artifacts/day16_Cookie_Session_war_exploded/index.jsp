 <%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/7
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


    <%
      System.out.println("hello jsp");

      int i = 5;
      String contextPath = request.getContextPath();
      out.println(contextPath);
    %>

    <%!
      int i = 3;
    %>

    <%= "hello" %>


    <h1>Hi JSP</h1>
  </body>
</html>
