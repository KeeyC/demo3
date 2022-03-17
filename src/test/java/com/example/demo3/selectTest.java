package com.example.demo3;

import com.example.demo3.service.SelectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class selectTest {
    @Autowired
    SelectService selectService;
    @Test
    public void SelectTest(){
selectService.SelectStudent();    }
}
