package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ResultServiceTest {

    @Test
    void shouldReturnPassWhenMarksAre40OrAbove() {
        ResultService service = new ResultService();
        String result = service.calculateResult(55);
        assertEquals("PASS", result);
    }

    @Test
    void shouldReturnFailWhenMarksBelow40() {
        ResultService service = new ResultService();
        String result = service.calculateResult(30);
        assertEquals("FAIL", result);
    }

    @Test
    void shouldReturnGradeA() {
        ResultService service = new ResultService();
        String grade = service.calculateGrade(85);
        assertEquals("A", grade);
    }

    @Test
    void shouldReturnGradeB() {
        ResultService service = new ResultService();
        String grade = service.calculateGrade(65);
        assertEquals("B", grade);
    }

    @Test
    void shouldReturnGradeC() {
        ResultService service = new ResultService();
        String grade = service.calculateGrade(45);
        assertEquals("C", grade);
    }

    @Test
    void shouldReturnGradeF() {
        ResultService service = new ResultService();
        String grade = service.calculateGrade(20);
        assertEquals("F", grade);
    }
}
