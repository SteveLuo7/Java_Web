package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RequestDemo4", value = "/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);

        if (referer.contains("/day14")) {
//            System.out.println("Playing....");
//            response.setContentType("text/html;charset=uft-8");
            response.getWriter().write("Playing Movie");

        } else {
//            System.out.println("Please Backwards....");
//            response.setContentType("text/html;charset=uft-8");
            response.getWriter().write("This is not right");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
