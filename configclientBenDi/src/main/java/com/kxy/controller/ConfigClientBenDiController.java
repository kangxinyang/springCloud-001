package com.kxy.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class ConfigClientBenDiController {


    @Value("${server.port}")  //获取配置文件中的 server.port
    private String port;

    @Value("${foo}")          //获取配置文件中的  foo
    private String foo;


    //返回 index 页面
    @GetMapping("/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
