package com.example.demo3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo3.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
