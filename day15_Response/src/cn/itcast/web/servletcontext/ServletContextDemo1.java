package cn.itcast.web.servletcontext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletContextDemo1", value = "/ServletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext context1 = request.getServletContext();

        ServletContext context2 = this.getServletContext();

        System.out.println(context1);
        System.out.println(context2);
        System.out.println(context1 == context2);
    }
}
