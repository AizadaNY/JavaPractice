package org.example.week4.hw;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private int creditHours;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }

    public void assignCourse(Student student) {
        students.add(student);
    }



}
