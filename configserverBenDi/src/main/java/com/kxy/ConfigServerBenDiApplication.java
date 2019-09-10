package com.kxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config ServerBenDi 启动类
 */
@SpringBootApplication  //表示当前类是Springboot入口
@EnableConfigServer     //声明配置中心 （微服务中的服务配置中心，通过这个注解可以实现配置托管，如git或者svn）
public class ConfigServerBenDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBenDiApplication.class, args);
    }


}

