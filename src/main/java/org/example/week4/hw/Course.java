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

    public void assignCourse(Student student) {
        students.add(student);
    }

    public void listStudents(){
        for (Student student:students){
            System.out.println(student.getName());
        }
    }


}
