package com.yhao.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class DashBoardApp {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApp.class, args);
    }
}
