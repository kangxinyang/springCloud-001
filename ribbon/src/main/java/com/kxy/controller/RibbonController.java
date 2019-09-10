package com.kxy.controller;

import com.kxy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Controller层
 *      Ribbon 负载均衡
 *      http://localhost:8040/ribbon/findAll
 *
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;


    //查询全部
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        //localhost:8010 ==> provider
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }


    //返回到 首页
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }

}
