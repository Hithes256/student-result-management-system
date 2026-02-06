package com.student.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentResultServiceTest {

    @Test
    void testPassResult() {
        StudentResultService service = new StudentResultService();
        assertEquals("PASS", service.getResult(75));
    }

    @Test
    void testFailResult() {
        StudentResultService service = new StudentResultService();
        assertEquals("FAIL", service.getResult(30));
    }
}
