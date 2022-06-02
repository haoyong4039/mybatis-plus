package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{
    public static void main(String[] args)
    {
        System.out.println("this is hotfix 0.0.5");
        SpringApplication.run(DemoApplication.class, args);
    }
}
