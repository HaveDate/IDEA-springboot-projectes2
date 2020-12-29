package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/")
    public @ResponseBody Student queryStudentById(Integer id){
        Student student = studentService.queryStudentByid(id);

        return student;
    }
}
