package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultController {

    private final ResultService service;

    public ResultController(ResultService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/result")
    public String result(@RequestParam int marks, Model model) {
        model.addAttribute("marks", marks);
        model.addAttribute("result", service.calculateResult(marks));
        model.addAttribute("grade", service.calculateGrade(marks));
        return "index";
    }
}
