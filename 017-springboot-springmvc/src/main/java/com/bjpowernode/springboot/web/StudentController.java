package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
//    @ResponseBody
    public Object Student(){

        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");

        return student;
    }

    @RequestMapping(value = "/queryStudentById")
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }
}
