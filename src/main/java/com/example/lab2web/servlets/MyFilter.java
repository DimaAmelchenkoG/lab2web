package com.example.lab2web.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyFilter implements Filter {
    private String servletCheck;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        servletCheck = "/controller";
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String path = httpServletRequest.getServletPath();
        if (path.equals(servletCheck)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            httpServletResponse.setStatus(400);
            String pathError = "/html/error.html";
            ServletContext servletContext = httpServletRequest.getServletContext();
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(pathError);
            requestDispatcher.forward(httpServletRequest, httpServletResponse);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
