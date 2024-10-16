package org.example.week4.hw;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Professor> professors;

    public Department(String name){
        this.name=name;
        this.professors=new ArrayList<>();
    }

   public void addProfessor(Professor professor){
        professors.add(professor);
   }

   public void getProfessorsList(){
        for(Professor professor:professors){
            System.out.println(professor.getName());
        }

   }

}
