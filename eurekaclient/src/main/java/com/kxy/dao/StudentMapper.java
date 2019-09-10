package com.kxy.dao;

import com.kxy.pojo.Student;

import java.util.Collection;
import java.util.List;

/**
 * StudentMapper 接口
 */
public interface StudentMapper {

    //查询全部
    public Collection<Student> findAll();

    //查询详情
    public Student findById(Long id);

    //添加
    public void save(Student student);

    //修改
    public void update(Student student);


    //删除
    public void deleteById(Long id);

}
