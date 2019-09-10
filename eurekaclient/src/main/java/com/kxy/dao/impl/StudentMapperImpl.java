package com.kxy.dao.impl;

import com.kxy.dao.StudentMapper;
import com.kxy.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * StudentMapperImpl 实现类
 */

@Repository
public class StudentMapperImpl implements StudentMapper {


    //定义Map集合，创建map对象
    private static Map<Long,Student> studentMap;
    static{
        studentMap = new HashMap<>();
        //设置数据，测试用  (未连接数据库)
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",23));
        studentMap.put(3L,new Student(3L,"王五",24));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void update(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
