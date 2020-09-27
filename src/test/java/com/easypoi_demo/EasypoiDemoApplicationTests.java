package com.easypoi_demo;

import com.easypoi_demo.entity.Student;
import com.easypoi_demo.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EasypoiDemoApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        List<Student> studentList = studentMapper.selectList(null);
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
    }

}
