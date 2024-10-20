package org.example.week4.hw;

public class AdjunctProfessor extends Professor {

    private int coursesTaught;

    public AdjunctProfessor(String name,String department,int coursesTaught) {
        super(name,department);
        this.coursesTaught=coursesTaught;
    }

    @Override
    public double calculateSalary() {
        return coursesTaught*1500;
    }


}
