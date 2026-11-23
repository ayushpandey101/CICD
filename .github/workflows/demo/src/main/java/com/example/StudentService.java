package com.example;

public class StudentService {

public String calculateGrade(Student student) {

int marks = student.getMarks();

if (marks >= 90) {
return "A";
} else if (marks >= 75) {
return "B";
} else if (marks >= 60) {
return "C";
} else if (marks >= 40) {
return "D";
} else {
return "F";
}
}

public boolean isPassed(Student student) {
return student.getMarks() >= 40;
}
}
 