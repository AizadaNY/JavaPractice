package org.example.week4.hw;

public abstract class Professor implements Teach, Evaluatable{

    private String name;
    private double salary;
    private Department departmentName;

    public void teachCourse(){

    }

    public void calculateSalary(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Department departmentName) {
        this.departmentName = departmentName;
    }
}
