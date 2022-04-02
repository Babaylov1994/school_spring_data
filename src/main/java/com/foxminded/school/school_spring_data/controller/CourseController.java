package com.foxminded.school.school_spring_data.controller;

import com.foxminded.school.school_spring_data.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("allCourse", courseService.getAll().orElse(null));
        return "course/courseIndex";
    }
}
