<%--
  Created by IntelliJ IDEA.
  User: Steve
  Date: 2022/6/7
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<script>
    window.onload = function () {
        document.getElementById("img").onclick = function () {
            this.src = "/day16/CheckCodeServlet?time=" + new Date().getTime();
        }
    }

</script>

<style>

    div {
        color: red;
    }


</style>

<body>

    <form action="/day16/loginServlet" method="post">

        <table>

            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>

            <tr>
                <td>密码</td>
                <td><input type="text" name="password"></td>
            </tr>

            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode"></td>
            </tr>

            <tr>
                <td colspan="2"><img id="img" src="/day16/CheckCodeServlet"></td>
            </tr>

            <tr>
                 <td colspan="2"><input type="submit" value="submit"></td>
            </tr>
        </table>

    </form>

        <div><%=request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error")%></div>
        <div><%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%></div>


</body>
</html>
