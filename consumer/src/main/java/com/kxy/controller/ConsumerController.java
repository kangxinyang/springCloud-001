package com.kxy.controller;

import com.kxy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Controller  层
 * 服务消费者-Consumer
 *
 *         http://localhost:8020/consumer/findAll
 *         http://localhost:8020/consumer/findById/{id}
 *         http://localhost:8020/consumer/save
 *         http://localhost:8020/consumer/update
 *         http://localhost:8020/consumer/deleteById/{id}
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;


    //查询全部 (方法1)
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        //调用eurekaclient里面的controller对应的方法,返回的类型
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    //查询全部 (方法2)
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }


    //查询详情 (方法1)
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",Student.class,id).getBody();
    }
    //查询详情 (方法2)
    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }


    //添加 (方法1)
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null).getBody();
    }
    //添加 (方法2)
    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }


    //修改
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }


    //删除
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }



}
