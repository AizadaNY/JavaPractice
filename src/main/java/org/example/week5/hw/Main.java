package org.example.week5.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name=GetStudentInfo.getStudentName();
        int age=GetStudentInfo.getStudentAge();
        Student s1=new Student(name,age);
        CourseRegistration courseRegistration=new CourseRegistration();
        courseRegistration.registerStudent(s1);


    }
}
