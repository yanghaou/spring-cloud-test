package com.yhao.feign.consumer.service.impl;


import com.yhao.feign.consumer.service.MyFeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class MyFeignClientImpl implements MyFeignClient {

    public String sysHiFromClientOne( String name){
        return name+": 服务异常";
    }
}
