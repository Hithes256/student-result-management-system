package com.student;

import org.springframework.stereotype.Service;

@Service
public class ResultService {

    public String calculateResult(int marks) {
        return marks >= 40 ? "PASS" : "FAIL";
    }

    public String calculateGrade(int marks) {
        if (marks >= 75) return "A";
        if (marks >= 60) return "B";
        if (marks >= 40) return "C";
        return "F";
    }
}
