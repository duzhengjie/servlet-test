package com.example.demo;

import com.example.demo.test.MyServletContainerInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        SpringApplication.run(DemoApplication.class, args);
    }

}
