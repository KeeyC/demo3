package com.example.demo3;

import com.example.demo3.service.InsertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
@SpringBootTest
public class InsertTest {
    @Autowired
    InsertService insertService;
    @Test
    public void InsertStudent() {
        insertService.InsertStudent("xiaomi432ng",2,"boy");
       System.out.println("---- " +
               "插入成功");
    }

}
