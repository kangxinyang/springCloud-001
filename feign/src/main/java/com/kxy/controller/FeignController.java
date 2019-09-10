package com.kxy.controller;

import com.kxy.feign.FeignProviderClient;
import com.kxy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 *Controller层
 *
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;


    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }


    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }



}
