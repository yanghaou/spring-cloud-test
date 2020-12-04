package com.yhao.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="hiServiceError")
    public String hiService(String name){

        String r = restTemplate.getForObject("http://user-provider/hi?name="+name, String.class);
        System.out.println(r);
        return r;
    }

    public String hiServiceError(String name){
        return name +":服务提供方出问题了";
    }
}
