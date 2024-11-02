package org.example.week7;

public class Student {

    private int id;
    private String name;
    private double grade;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student name: " + name +
                "id: " + id +
                "grade: " + grade;
    }
}
