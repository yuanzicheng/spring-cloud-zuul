package com.example.eurekaclientconsumer.web;


import org.springframework.stereotype.Component;

@Component(value = "testService")
public class TestServiceFallback implements TestService{

    @Override
    public String test() {
        return "fallback";
    }
}
