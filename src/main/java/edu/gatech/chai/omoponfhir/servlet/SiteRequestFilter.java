package edu.gatech.chai.omoponfhir.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SiteRequestFilter implements Filter {
    private FilterConfig config = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filtering the request");
        HttpServletRequest x = (HttpServletRequest)servletRequest;
        String path = "/"+x.getRequestURI().split("/",5)[4];
        String site_id = x.getRequestURI().split("/",5)[2];
        servletRequest.setAttribute("site_id",site_id);
        x.getRequestDispatcher(path
//                +"?site_id="+site_id
        ).forward(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        config= null;
    }
}
