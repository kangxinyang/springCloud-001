package com.kxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *启动类
 *  通过RestTemplate 实现了对provider服务请求者的所有请求调用
 */
@SpringBootApplication
public class RestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }


    /**
     * 创建RestTemplate的实例
     *   启动的时候就返回一个RestTemplate实例
     * @return
     */
    @Bean      //把这个实例添加到AOP容器中
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
