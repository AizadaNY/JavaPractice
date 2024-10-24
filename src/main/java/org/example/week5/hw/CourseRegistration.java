package org.example.week5.hw;


import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {

    ArrayList<Student> registeredStudents=new ArrayList<>();

    public void registerStudent(Student student) {
        try {
            registeredStudents.add(student);
            if (registeredStudents.size() >= 5) {
                throw new CourseFullException();
            }
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }


}
