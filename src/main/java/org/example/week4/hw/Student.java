package org.example.week4.hw;

import java.util.List;

public class Student {

    private String name;
    private static int id = 0;
    List<Course> registeredCourses;

    public Student(String name) {
        this.name = name;
        id++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void printStudentInfo() {
        System.out.println("Student name is " + getName()
                + " id is " + getId());
    }
}
