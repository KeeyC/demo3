package com.example.demo3.service.Impl;

import com.example.demo3.entity.Student;
import com.example.demo3.mapper.StudentMapper;
import com.example.demo3.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateServiceImpl implements UpdateService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public void updateStudentNameById(int id , String name) {
        Student student = new Student() ;
        student.setStudentId(id);
        student.setStudentName(name);
        studentMapper.updateById(student);

    }
}
