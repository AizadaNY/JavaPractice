package org.example.Task2.school.managment;

import org.example.Task2.school.Person;

public class Student extends Person {

    private int studentId;
    private String[] enrolledCourses;
    private double tuition;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void enrollCourses(String[] courses){
     enrolledCourses=courses;
    }

    public void enrollCourses(String course){

    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses= enrolledCourses;
    }

    public void calculateTuition(){
        double v = getTuition() * (getEnrolledCourses().length);
    }
}
