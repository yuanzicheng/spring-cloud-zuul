package com.example.eurekaclientconsumer.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-provider",fallback = TestServiceFallback.class)
public interface TestService {

    @GetMapping("/test")
    String test();

}

