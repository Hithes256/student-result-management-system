package com.student.demo;

public class StudentResultService {

    public String getResult(int marks) {
        if (marks >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
