package com.easypoi_demo.controller;

import com.easypoi_demo.entity.Student;
import com.easypoi_demo.service.StudentService;
import com.easypoi_demo.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody

public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getall")
    public List<Student> ListAllMessage() {
        List<Student> students = studentService.selectList(null);
        return students;
    }

    /**
     * 导出
     *
     * @param response
     */
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void exportExcel(HttpServletResponse response) throws IOException {
//        List<PersonExportVo> personList = new ArrayList<>();
        List<Student> students = studentService.selectList(null);


        ExcelUtils.exportExcel(students, "学生信息表", "学生信息", Student.class, "学生信息", response);
    }

}
