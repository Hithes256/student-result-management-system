package com.example.result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @GetMapping("/result")
    public String result() {
        return "Student Result System Running Successfully!";
    }
}
