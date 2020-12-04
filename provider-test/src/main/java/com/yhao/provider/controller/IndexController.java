package com.yhao.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;

    // 提供的方法
    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "minbo") String name) {
        String result = "hi " + name + " , i am from port:" + port;
        return result;
    }

}
