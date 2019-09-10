package com.kxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hystrix 启动类
 */

@SpringBootApplication  //表示当前类是Springboot入口
@EnableFeignClients     //Feign客户端 注解
@EnableCircuitBreaker   //声明启用数据监控
@EnableHystrixDashboard //声明启用可视化数据监控
public class HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }


}

