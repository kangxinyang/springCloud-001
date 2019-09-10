package com.kxy.controller;

import com.kxy.feign.FeignProviderClient;
import com.kxy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    //注入 FeignProviderClient
    @Autowired
    private FeignProviderClient feignProviderClient;


    //查询全部
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }


    //返回首页
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

}
