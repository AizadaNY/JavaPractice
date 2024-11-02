package org.example.week7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public void saveStudentsToFile(String filePath, List<Student> students) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (int i = 0; i < students.size(); i++) {
            String studentInfo = students.get(i).getId() + "," + students.get(i).getName() + "," +
                    students.get(i).getGrade();
            writer.write(studentInfo);
            writer.write(",");
            writer.newLine();
        }
    }

    public List<Student> loadStudentsFromFile(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] studentInfo = line.split(",");
            students.add(new Student(
                    Integer.parseInt(studentInfo[0]),
                    studentInfo[1],
                    Double.parseDouble(studentInfo[2])));

        }
        return students;
    }

    public void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void updateGrade(int id, double newGrade, String filePath) {

    }


}
