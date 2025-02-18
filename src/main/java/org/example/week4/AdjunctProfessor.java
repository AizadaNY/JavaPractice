package org.example.week4;

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


    @Override
    public void gradeStudents() {

    }

    @Override
    public void conductLecture() {

    }
}
