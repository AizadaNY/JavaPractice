package org.example.week4.hw;

public class FullTimeProfessor extends Professor{

    private double monthlySalary;

    public FullTimeProfessor(String name,String department,String monthlySalary) {
        super(name,department);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
    }

    @Override
    public void conductLecture() {

    }

    @Override
    public void gradeStudents() {

    }
}
