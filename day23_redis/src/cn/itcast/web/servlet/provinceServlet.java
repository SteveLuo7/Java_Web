package cn.itcast.web.servlet;

import cn.itcast.domain.Province;
import cn.itcast.service.ProvinceService;
import cn.itcast.service.impl.ProvinceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "provinceServlet", value = "/provinceServlet")
public class provinceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProvinceService service = new ProvinceServiceImpl();
//
//        List<Province> list = service.findAll();
//
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(list);

        String json = service.findAllJson();

        System.out.println(json);

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
