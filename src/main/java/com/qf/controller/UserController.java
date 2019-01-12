package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author mac
 *
 * @Date 2019-01-12
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private IUserservice userservice;
    @RequestMapping("/query")
    public List<Student> query(Model model){
        List<Student> list=userservice.queryAll();

        System.out.println("查询学生信息");

        return list;
    }
}
