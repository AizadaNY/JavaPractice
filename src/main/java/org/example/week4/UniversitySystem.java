package org.example.week4;

public class UniversitySystem {

    public static void main(String[] args) {
        Department csDept=new Department("Computer Science");

        AdjunctProfessor profJohn=new AdjunctProfessor("John","Computer Science",3);
        FullTimeProfessor profSmith=new FullTimeProfessor("Mary","Computer Science",5000);

        csDept.addProfessor(profJohn);
        csDept.addProfessor(profSmith);

        Course javaCourse=new Course("Java Programming", 3);
        Course dsCourse=new Course("Data Structure",5);

        csDept.addCourses(javaCourse);
        csDept.addCourses(dsCourse);

        Student janeDoe = new Student("Jane Doe", 101);
        Student markLee = new Student("Mark Lee", 102);

        javaCourse.addStudents(janeDoe);
        dsCourse.addStudents(markLee);

        janeDoe.addGrade(javaCourse, 90);
        markLee.addGrade(dsCourse, 85);

        // Print professor list and student grade report
        csDept.getProfessorsList();
        janeDoe.printGradeReport();
        markLee.printGradeReport();




    }
}
