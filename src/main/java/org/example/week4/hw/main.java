package org.example.week4.hw;

public class main {
    public static void main(String[] args) {

        Professor p1 = new AdjunctProfessor("Aiza");
        Professor p2 = new AdjunctProfessor("Maya");
        Department cs = new Department("Math");
        cs.addProfessor(p1);
        cs.addProfessor(p2);
        cs.getProfessorsList();

        Student s1=new Student("Student1");
        Student s2=new Student("Student2");

        Course c1=new Course("Java");
        c1.assignCourse(s1);
        c1.assignCourse(s2);
        c1.listStudents();

    }
}
