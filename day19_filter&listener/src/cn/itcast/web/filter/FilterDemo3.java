package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo3 implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init.....");
    }

    public void destroy() {
        System.out.println("destroy.....");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter...");
        chain.doFilter(request, response);
    }
}
