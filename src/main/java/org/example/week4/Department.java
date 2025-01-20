package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Professor> professors;
    private List<Course> courses;

    public Department(String departmentName){
        this.departmentName=departmentName;
        this.professors=new ArrayList<>();
        this.courses=new ArrayList<>();
    }

   public void addProfessor(Professor professor){
        professors.add(professor);
   }

   public void addCourses(Course course){
        courses.add(course);
   }

   public String getDepartmentName(){
        return departmentName;
   }

   public void getProfessorsList(){
        for(Professor professor:professors){
            System.out.println(professor.getName());
        }

   }

   public void listCourses(){
        for(Course course:courses){
            System.out.println("Course "+ course.getCourseName());
        }
   }

}
