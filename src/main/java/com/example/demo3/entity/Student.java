package com.example.demo3.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {
        @TableId
        private int studentId;
        private String studentName;
        private  int studentGrade;
        private String studentGender;
        }
