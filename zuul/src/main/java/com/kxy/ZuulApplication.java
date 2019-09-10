package com.kxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务网关 启动类
 */

@EnableZuulProxy          //设置该类是网关的启动类 [包含了@EnableZuulServer]
@EnableAutoConfiguration  //自动装载配置 --可以帮助Spring Boot应用将所有符合条件的@Configuration配置到当前Spring Boot创建并使用的IOC容器中
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }


}

