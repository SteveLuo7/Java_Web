package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseDemo4", value = "/ResponseDemo4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setCharacterEncoding("UTF-8");
//        response.setHeader("content-type","text/html;charset=utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter pw = response.getWriter();
        pw.write("<h1>hello 你好啊 response</h1>");

    }
}
