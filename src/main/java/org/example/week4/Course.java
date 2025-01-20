package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private int creditHours;
    private List<Student> students;

    public Course(String courseName,int creditHours) {
        this.courseName = courseName;
        this.creditHours=creditHours;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student){
        students.add(student);
    }
    public String getCourseName(){
        return courseName;
    }

   public void listStudents(){
        for(Student student:students){
            System.out.println("Student name "+student.getStudentName());
        }
   }



}
