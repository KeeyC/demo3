package com.example.demo3.service.Impl;

import com.example.demo3.entity.Student;
import com.example.demo3.mapper.StudentMapper;
import com.example.demo3.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelectServiceImpl implements SelectService {

    @Autowired
    StudentMapper studentMapper;
    @Override
    public String SelectStudent() {
        List<Student> studentList = studentMapper.selectList(null);
        for(Student student:studentList){
            System.out.println(student);

        }
        return "Select Secuess";
    }

    @Override
    public String SelectStudentById(int id) {
        //id是主键，唯一标识，所以应该不会打印出列表
        Student student = studentMapper.selectById(id);
        System.out.println(student);
        return "Secuess";
    }

    @Override
    public void SelectStudentByName(String name) {
        Map<String,Object> map= new HashMap<>();
        map.put("Student_name",name);
        List<Student> studentNameList=studentMapper.selectByMap(map);
    }
}
