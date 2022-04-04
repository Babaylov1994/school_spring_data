package com.foxminded.school.school_spring_data.controller;

import com.foxminded.school.school_spring_data.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("teachers", teacherService.getAll().orElse(null));
        return "teacher/teacherIndex";
    }
}
