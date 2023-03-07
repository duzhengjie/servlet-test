package com.example.demo.test;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServlet;
import java.util.Set;

@HandlesTypes({javax.servlet.Servlet.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    static {
        System.out.println(123123);
    }

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println(3333);
    }
}
