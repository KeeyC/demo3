package com.example.demo3.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo3.entity.Student;
import com.example.demo3.mapper.StudentMapper;
import com.example.demo3.service.InsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InsertServiceImpl extends ServiceImpl<StudentMapper,Student> implements InsertService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void InsertStudent(String name, int grade, String gender) {
//        Map<String,Object> map =new HashMap<>();
//        map.put("studentName",name);
//        map.put("studentGrade",grade);
//        map.put("studentGender",gender);
        Student student01=new Student();
        student01.setStudentGender(gender);
        student01.setStudentGrade(grade);
        student01.setStudentName(name);
        studentMapper.insert(student01);

    }
}
