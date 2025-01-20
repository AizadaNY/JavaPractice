package org.example.week5;

public class CourseFullException extends RuntimeException{

    public CourseFullException(){

    }

    public CourseFullException(String message){
        super(message);
    }
}
