package org.example.Task2.school.managment;

public class CourseManagement {

    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student){

    }

    public void displayAllStudents(){
        for (Student student:getStudents()){
            System.out.println(student);
        }
    }
}
