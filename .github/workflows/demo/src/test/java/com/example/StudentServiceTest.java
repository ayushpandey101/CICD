package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentServiceTest {

StudentService service = new StudentService();

@Test
void testGradeA() {

Student student = new Student(101, "Rahul", 95);

assertEquals("A", service.calculateGrade(student));
}

@Test
void testGradeB() {

Student student = new Student(102, "Priya", 80);

assertEquals("B", service.calculateGrade(student));
}

@Test
void testGradeC() {

Student student = new Student(103, "Arun", 65);

assertEquals("C", service.calculateGrade(student));
}

@Test
void testGradeD() {

Student student = new Student(104, "John", 45);

assertEquals("D", service.calculateGrade(student));
}

@Test
void testGradeF() {

Student student = new Student(105, "David", 30);

assertEquals("F", service.calculateGrade(student));
}

@Test
void testStudentPassed() {

Student student = new Student(106, "Anita", 70);

assertTrue(service.isPassed(student));
}

@Test
void testStudentFailed() {

Student student = new Student(107, "Ravi", 35);

assertFalse(service.isPassed(student));
}
}
 