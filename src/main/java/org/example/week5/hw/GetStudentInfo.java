package org.example.week5.hw;

import java.util.Scanner;

public class GetStudentInfo {

    public static String getStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide student name");
        String name = scanner.next();
        if (name.equals("") || name.equals(" ") || name.equals(null) || name == null) {
            throw new InvalidNameException("Invalid Name Exception");
        }
        return name;
    }

    public static int getStudentAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide student age");
        int age = scanner.nextInt();
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Invalid Age Exception");
        }
        return age;
    }
}
