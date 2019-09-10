package com.kxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server注册中心 启动类
 */
@SpringBootApplication  //表示当前类是Springboot入口
@EnableEurekaServer     //声明该类是Eureka Server微服务，提供服务注册和服务发现功能，即注册中心
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
