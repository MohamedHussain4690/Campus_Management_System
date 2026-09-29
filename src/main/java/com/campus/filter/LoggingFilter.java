package com.campus.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;



public class LoggingFilter extends HttpFilter {
    @Override 
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws Exception, ServletException{
        System.out.println("Request received");
        chain.doFilter(request,response);
        System.out.println("Response sent:");
    }
}