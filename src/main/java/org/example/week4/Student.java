package org.example.week4;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String studentName;
    private int studentID;
    private Map<Course,Integer> grades;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        grades = new HashMap<>();
    }

    public void addGrade(Course course, int grade) {
        grades.put(course, grade);
    }

    public String getStudentName() {
        return studentName;
    }

    public void printGradeReport() {
        System.out.println("Grade report for " + studentName);
        for (Course course : grades.keySet()) {
            System.out.println("Course " + course + " grade is " + grades.get(course));
        }
    }
}
