package com.yhao.feign.consumer.service;


import com.yhao.feign.consumer.service.impl.MyFeignClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-provider", fallback = MyFeignClientImpl.class)
public interface MyFeignClient {

    @GetMapping("/hi")
    String sysHiFromClientOne(@RequestParam String name);
}
