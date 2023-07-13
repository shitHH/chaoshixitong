package com.myshop.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 魏范彬
 * 字符集过滤器
 */
@WebFilter("*")
public class CharEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器启动");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        try {
            System.out.println("字符集过滤中...");
            String charSet="utf-8";
            //先将Servlet对象强转为HttpServlet对象
            HttpServletRequest request=(HttpServletRequest)servletRequest;
            HttpServletResponse response=(HttpServletResponse)servletResponse;
            //设置字符集
            request.setCharacterEncoding(charSet);
            response.setCharacterEncoding(charSet);
            //继续向下传递
            filterChain.doFilter(request,response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}

