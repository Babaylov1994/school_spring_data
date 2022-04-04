package com.foxminded.school.school_spring_data.controller;

import com.foxminded.school.school_spring_data.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("students", studentService.getAll().orElse(null));
        return "student/studentIndex";
    }
}
