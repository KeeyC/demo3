package com.example.demo3;

import com.example.demo3.mapper.StudentMapper;
import com.example.demo3.service.DeleteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
public class Deletetest {
    @Autowired
    DeleteService deleteService;
    @Test
    public void DeleteStudentById(){

   int id = 1;
        deleteService.deleteStudentById(id);
        System.out.println("删除成功");
    }
}
