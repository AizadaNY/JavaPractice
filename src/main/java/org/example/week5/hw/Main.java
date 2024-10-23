package org.example.week5.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student s1=new Student(GetStudentInfo.getStudentName(), GetStudentInfo.getStudentAge());
        CourseRegistration courseRegistration=new CourseRegistration();
        courseRegistration.registerStudent(s1);


    }
}
