package com.easypoi_demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.easypoi_demo.entity.Student;
import com.easypoi_demo.mapper.StudentMapper;
import com.easypoi_demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
