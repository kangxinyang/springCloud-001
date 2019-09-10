package com.kxy.feign;

import com.kxy.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * 声明式 接口 FeignProviderClient
 */

@FeignClient(value = "provider")  //接口访问的服务, value = "provider"指向注册中心问服务的名字
public interface FeignProviderClient {


    @GetMapping("/student/findAll")
    public Collection<Student> findAll();


    @GetMapping("/student/index")
    public String index();
}
