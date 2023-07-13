package com.myshop.filter;

import com.myshop.bean.Login;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 张向东
 * 权限过滤
 */
@WebFilter(urlPatterns = {"/md_shouye.jsp","/goodshome.jsp","/order.jsp"})
public class AuthorFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("权限过滤");
        //获得session
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        HttpSession session=request.getSession();
        System.out.println(session);
        //从session中取得当前对象
        Object obj=session.getAttribute("currentLogin");
        System.out.println(obj);
        //判断session中是否有值
        if(obj!=null){
            Login login=(Login)obj;
            //判断是否登录
            if(login.getwId()==1){
                filterChain.doFilter(request,servletResponse);
            }else if(login.getwId()==2){
                filterChain.doFilter(request,servletResponse);
            }else if(login.getwId()==3){
                filterChain.doFilter(request,servletResponse);
            }else {
                //重定向到登录页面
                response.sendRedirect("login.jsp");
            }
        }else {
            //重定向到登录页面
            response.sendRedirect("login.jsp");
        }
    }
}
