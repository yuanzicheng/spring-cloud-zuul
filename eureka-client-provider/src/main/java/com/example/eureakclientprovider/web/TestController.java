package com.example.eureakclientprovider.web;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class TestController {

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;

    @GetMapping("/test")
    public String test(){
        return "instanceId:"+eurekaInstanceConfig.getInstanceId()+",host:"+eurekaInstanceConfig.getHostName(false);
    }
}
