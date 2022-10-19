<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/7
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>itcast</title>
</head>
<body>
    <%
        Cookie[] cookies = request.getCookies();

        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)) {

                    flag = true;

                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String str_date = sdf.format(date);
                    System.out.println(str_date);
                    String encode_date = URLEncoder.encode(str_date, "utf-8");
                    cookie.setValue(encode_date);
                    cookie.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(cookie);

                    String value = cookie.getValue();
                    System.out.println(value);
                    String decodeValue = URLDecoder.decode(value, "utf-8");
                    System.out.println(decodeValue);

                    out.write("<h1>欢迎回来,您上次访问的时间为" +decodeValue +"</h1>");

                    break;
                }
            }
        }

        if (cookies == null || cookies.length == 0 || flag == false) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str_date = sdf.format(date);
            String encode_date = URLEncoder.encode(str_date, "utf-8");

            Cookie cookie = new Cookie("lastTime", encode_date);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);

            out.write("<h1>You re Welcome </h1>");
        }
    %>


</body>
</html>
