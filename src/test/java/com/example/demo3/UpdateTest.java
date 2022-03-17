package com.example.demo3;

import com.example.demo3.entity.Student;
import com.example.demo3.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpdateTest {
    @Autowired
    StudentMapper studentMapper;
    @Test
    public void Update(){
        Student student = new Student() ;
        student.setStudentId(6);
        student.setStudentName("lao Niu");
        studentMapper.updateById(student);
    }
}
