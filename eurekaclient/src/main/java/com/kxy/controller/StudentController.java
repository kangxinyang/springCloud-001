package com.kxy.controller;

import com.kxy.dao.StudentMapper;
import com.kxy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Controller 层
 *    Provider 服务提供者
* *          http://localhost:8010/student/findAll
*  *         http://localhost:8010/student/findById/{id}
*  *         http://localhost:8010/student/save
*  *         http://localhost:8010/student/update
*  *         http://localhost:8010/student/deleteById/{id}
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired   //注入
    private StudentMapper studentMapper;


    //测试Zuul 内部负载均衡 用的
    //(程序启动，@Value注解读取配置参数赋给成员变量)
    @Value("${server.port}")  //读取配置文件中的配置
    private String port;      //定义一个成员变量

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port; //返回打印 成员变量
    }


    //查询全部
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentMapper.findAll();
    }


    //查询详情
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentMapper.findById(id);
    }

    //添加
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentMapper.save(student);
    }

    //修改
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentMapper.update(student);
    }


    //删除
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentMapper.deleteById(id);
    }

}
