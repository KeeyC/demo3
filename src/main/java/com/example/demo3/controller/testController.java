package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class testController {
    @GetMapping("/hello")
    /*
    @ResponseBody使用时机：当我们想让页面知道我们返回的数据不是按照html标签的页面来解析，
    而是其他的某种格式的数据解析时(如json,xml等)使用
     */
    @ResponseBody
    public String HelloController(){
        return "Hello Controller!";
    }
}
