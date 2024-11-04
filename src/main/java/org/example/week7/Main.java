package org.example.week7;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Aizada\\JavaClasses\\src\\main\\resources\\students.txt";
        Student s1 = new Student(101, "John Doe", 88.5);
        Student s2 = new Student(102, "Jane Smith", 92.0);
        Student s3 = new Student(103, "Emily White", 76.3);
        Student s4 = new Student(104, "Emil White", 78.3);
        Student s5 = new Student(105, "Eric Rose", 91.3);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        saveStudentsToFile(path, students);
        List<Student> students1 = loadStudentsFromFile(path);
        displayStudents(students1);
        updateGrade(103, 80.0, path);
        System.out.println("This is after updating data");
        List<Student> students2 = loadStudentsFromFile(path);
        displayStudents(students2);
//        deleteStudent(102, path);
//        System.out.println("This is after deleting data");
        List<Student> students3 = loadStudentsFromFile(path);
        displayStudents(students3);
        sortStudentsByGrade(students3, "");
        System.out.println("This is after sort data");
        displayStudents(students3);


    }

    public static void saveStudentsToFile(String filePath, List<Student> students) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (int i = 0; i < students.size(); i++) {
            String studentInfo = students.get(i).getId() + "," + students.get(i).getName() + "," +
                    students.get(i).getGrade();
            writer.write(studentInfo);
            writer.newLine();
        }
        writer.close();
    }

    public static List<Student> loadStudentsFromFile(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] studentInfo = line.split(",");
                students.add(new Student(
                        Integer.parseInt(studentInfo[0]),
                        studentInfo[1],
                        Double.parseDouble(studentInfo[2])));

            }
        } catch (NullPointerException ex) {

        }
        return students;
    }

    public static void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static void updateGrade(int id, double newGrade, String filePath) throws IOException {
        List<Student> students = loadStudentsFromFile(filePath);
        for (Student student : students) {
            if (student.getId() == id) {
                student.setGrade(newGrade);
            }
        }
        saveStudentsToFile(filePath, students);
    }

    public static void deleteStudent(int id, String filePath) throws IOException {
        List<Student> students = loadStudentsFromFile(filePath);
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
            }
        }
        saveStudentsToFile(filePath, students);
    }

    public static void sortStudentsByGrade(List<Student> students, String order) {
        if (order.equalsIgnoreCase("desc")) {
            students.sort(Comparator.comparing(Student::getGrade).reversed());
        } else {
            students.sort(Comparator.comparing(Student::getGrade));
        }


    }


}
