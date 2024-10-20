package org.example.week4.hw;

public class FullTimeProfessor extends Professor{

    private double monthlySalary;

    public FullTimeProfessor(String name,String department,double monthlySalary) {
        super(name,department);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary() {
       return monthlySalary;
    }


}
