package com.example.demo3.controller;

import com.example.demo3.service.DeleteService;
import com.example.demo3.service.InsertService;
import com.example.demo3.service.SelectService;
import com.example.demo3.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
   private InsertService insertService ;

    @Autowired
    private DeleteService deleteService;

    @Autowired
    private SelectService selectService;

    @Autowired
    private UpdateService updateService;

    @PostMapping ("/InsertStudent")
    public String InsertStudent(
            @RequestParam(value = "gender") String gender,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "grade") int grade){
        insertService.InsertStudent(name,grade,gender);
        return "Insert Seccess";
    }

    @DeleteMapping("/DeleteStudentById")
    public void DeleteStudentById(@RequestParam(value = "id")int id){
        deleteService.deleteStudentById(id);
    }

    @DeleteMapping("/DeleteStudentByGender")
    public void DeleteStudentByGender(@RequestParam(value = "gender") String gender){
        deleteService.deleteStudentByGender(gender);
    }

    @DeleteMapping("/deleteStudentbyName")
    public void DeleteStudentByName(@RequestParam(value = "name")String name){
        deleteService.deleteStudentByName(name);
    }
    @GetMapping("/getStudentList")
    public void SelectStudentList(){
        selectService.SelectStudent();
    }
    @GetMapping("/getStudentListByName")
    public void SelectStudentListByName(@RequestParam(value = "name") String name){
        selectService.SelectStudentByName(name);
    }
    @GetMapping("/getStudentListById")
    public void SelectStudentListById(@RequestParam(value = "id")int id){
        selectService.SelectStudentById(id);
    }

    @PostMapping("/updateStudentById")
    public void updateStudentById(@RequestParam(value = "id")int id ,@RequestParam(value = "name") String name){
    updateService.updateStudentNameById(id,name);
    }




}
