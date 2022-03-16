package com.example.demo3.controller;

import com.example.demo3.service.InsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
   private InsertService insertService ;



    @PostMapping ("/InsertStudent")
    public void InsertStudent(
            @RequestParam(value = "gender") String gender,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "grade") int grade){
        insertService.InsertStudent(name,grade,gender);
    }
}
