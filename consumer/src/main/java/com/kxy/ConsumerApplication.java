package com.kxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者 启动入口
 */
@SpringBootApplication  //表示当前类是Springboot入口
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
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

