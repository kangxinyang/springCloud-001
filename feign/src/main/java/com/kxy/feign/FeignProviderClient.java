package com.kxy.feign;

import com.kxy.feign.impl.FeignError;
import com.kxy.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * 声明式 接口 FeignProviderClient
 */

@FeignClient(value = "provider",fallback = FeignError.class)  //接口访问的服务  ,fallback = FeignError.class 设置映射【fallback 降级处理】
public interface FeignProviderClient {


    @GetMapping("/student/findAll")
    public Collection<Student> findAll();


    @GetMapping("/student/index")
    public String index();
}
