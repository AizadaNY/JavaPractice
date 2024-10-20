package org.example.week4.hw;

public abstract class Professor implements Teach, Evaluatable {

    private String name;
    private double salary;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public abstract double calculateSalary();

    public void teachCourse() {
        System.out.println(name + "is teaching the " + department + " department");
    }


}
