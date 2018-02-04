package com.example.zuulserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class Application {

    @Bean
    public MyFilter myFilter(){
        return new MyFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
