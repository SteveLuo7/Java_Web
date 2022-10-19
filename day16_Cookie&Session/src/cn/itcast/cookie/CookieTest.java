package cn.itcast.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieTest", value = "/CookieTest")
public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

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

                    response.getWriter().write("<h1>欢迎回来,您上次访问的时间为" +decodeValue +"</h1>");

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

            response.getWriter().write("<h1>You re Welcome </h1>");
        }
    }
}
