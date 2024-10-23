package org.example.week5.hw;


import java.util.ArrayList;

public class CourseRegistration {

    ArrayList<Student> registeredStudents;

    public void registerStudent(Student student) {
        try {
            registeredStudents.add(student);
            if (registeredStudents.size() >= 5) {
                throw new CourseFullException();
            }
        } catch (NullPointerException exception) {
          System.out.println("");
        }
    }
}
