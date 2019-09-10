package com.kxy.feign.impl;

import com.kxy.feign.FeignProviderClient;
import com.kxy.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * FeignError 实现类
 *          FeignProviderClient 接口的实现类，
 *          定义容错处理逻辑，通过 @Component 注解将 FeignError 实例注入 IoC 容器中。
 */

@Component  //将FeignError实例注入到IoC 容器中
public class FeignError implements FeignProviderClient {


    @Override
    public Collection<Student> findAll() {
        return null;
    }


    //测试网址   http://localhost:8050/feign/index
    @Override
    public String index() {
        return "服务器维护中....";
    }


}
