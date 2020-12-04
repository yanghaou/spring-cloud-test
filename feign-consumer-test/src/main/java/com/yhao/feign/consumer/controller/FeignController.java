package com.yhao.feign.consumer.controller;

import com.yhao.feign.consumer.service.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    MyFeignClient myFeignClient;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return myFeignClient.sysHiFromClientOne(name);
    }

}
