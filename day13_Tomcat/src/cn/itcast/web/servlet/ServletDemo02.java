package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo02 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
//        servlet创建时执行 智慧执行一次
        System.out.println("init.....");
    }

    @Override
    public ServletConfig getServletConfig() {
//        来获取servlet的配置对象
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        servlet访问时执行 执行多次
        System.out.println("service......");
    }

    @Override
    public String getServletInfo() {
//        来获取servlet的一些信息。。。
        return null;
    }

    @Override
    public void destroy() {
//        servlet销毁时执行，服务器正常关闭时执行，执行一次
        System.out.println("destroy....");
    }
}
