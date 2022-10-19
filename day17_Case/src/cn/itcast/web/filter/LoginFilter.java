package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        String uri = request1.getRequestURI();

        if (uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/") || uri.contains("/fonts/") || uri.contains("/checkCodeServlet")) {
            chain.doFilter(request,response);
        } else {
            Object user = request1.getSession().getAttribute("user");
            if (user != null) {
                chain.doFilter(request,response);
            } else {
                request1.setAttribute("login_msg","Please Log in");
                request1.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }
    }
}
