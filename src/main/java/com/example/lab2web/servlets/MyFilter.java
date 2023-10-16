package com.example.lab2web.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String path = httpServletRequest.getServletPath();
        System.out.println("doFilter");
        if (path.equals("/controller")) {
            System.out.println("doFilter");
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            httpServletResponse.setStatus(400);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
