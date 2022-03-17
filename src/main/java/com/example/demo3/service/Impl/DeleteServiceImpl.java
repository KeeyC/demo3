package com.example.demo3.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo3.entity.Student;
import com.example.demo3.mapper.StudentMapper;
import com.example.demo3.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DeleteServiceImpl extends ServiceImpl<StudentMapper, Student> implements DeleteService {
    
    @Autowired
    StudentMapper studentMapper;
    @Override
    public void deleteStudentById(int id) {
    int StudentId=id;
    studentMapper.deleteById(StudentId);
    System.out.println("通过ID删除学生");
    }

    @Override
    public void deleteStudentByGender(String gender) {
        String StudentGender = gender;
        Map<String ,Object> map = new HashMap();
        map.put("Student_gender",StudentGender);
        studentMapper.deleteByMap(map);
    }

    @Override
    public void deleteStudentByName(String name) {
            Map<String,Object> map = new HashMap<>();
            map.put("Student_name",name);
            studentMapper.deleteByMap(map);
    }
}
