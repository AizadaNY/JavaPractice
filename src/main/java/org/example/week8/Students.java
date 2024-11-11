package org.example.week8;

import java.sql.*;

public class Students {

    String url = "jdbc:sqlite:C:/Users/Aizada/database/test.db";

    private Connection getConnection(String url) throws SQLException {
        return DriverManager.getConnection(url);
    }

    public void initialize() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Students (\n" +
                "id INTEGER Primary Key AUTOINCREMENT, \n" +
                "name VARCHAR NOT NULL, \n" +
                "age INTEGER , \n" +
                "grade DOUBLE);";
        try {
            Connection connection = getConnection(url);
            PreparedStatement prepStmt = connection.prepareStatement(createTableSQL);
            prepStmt.executeUpdate();
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addStudent(String name, int age, double grade) {
        String sql = "INSERT INTO students (name, age, grade)\n" +
                "VALUES (?, ?, ?);";
        Connection connection = null;
        try {
            connection = getConnection(url);
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1, name);
            prepStmt.setInt(2, age);
            prepStmt.setDouble(3, grade);
            int rowsInserted = prepStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Student info successfully inserted");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting student " + e.getMessage());
        }
    }

    //close with try catch with resources
    public void addStudent2(String name, int age, double grade) {
        String sql = "INSERT INTO students (name, age, grade)\n" +
                "VALUES (?, ?, ?);";
        try (Connection connection = getConnection(url);
             PreparedStatement prepStmt = connection.prepareStatement(sql);) {
            prepStmt.setString(1, name);
            prepStmt.setInt(2, age);
            prepStmt.setDouble(3, grade);
            int rowsInserted = prepStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Student info successfully inserted");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting student " + e.getMessage());
        }
    }

    public void getAllStudentsData() {
        String sql = "Select * from students";
        Connection connection = null;
        try {
            connection = getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("Student name is: " + resultSet.getString("name"));
                System.out.println("Student id is: " + resultSet.getInt("id"));
                System.out.println("Student name age: " + resultSet.getInt("age"));
                System.out.println("Student name grade: " + resultSet.getDouble("grade"));
                System.out.println("------------------------------------------------");

            }
        } catch (SQLException e) {
            System.out.println("Error retrieving student info " + e.getMessage());
        }
    }

    public void updateStudentGrade(int id, double grade) {
        String sql = "UPDATE students SET grade = ? WHERE id = ?";
        Connection connection = null;
        try {
            connection = getConnection(url);
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setDouble(1, grade);
            prepStmt.setInt(2, id);
            int rowUpdated = prepStmt.executeUpdate();
            if (rowUpdated > 0) {
                System.out.println("Student info successfully updated");
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving student info " + e.getMessage());
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students  WHERE id = ?";
        Connection connection = null;
        try {
            connection = getConnection(url);
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setInt(1, id);
            int rowUpdated = prepStmt.executeUpdate();
            if (rowUpdated > 0) {
                System.out.println("Student info successfully deleted");
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving student info " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Students students = new Students();
//        students.initialize();
//        students.addStudent("Aiz", 19, 99.9);
//        students.addStudent("Mia", 18, 97.1);
//        students.addStudent("Bob", 19, 89.5);
//        students.updateStudentGrade(2,50.3);
        students.deleteStudent(1);
        students.getAllStudentsData();
    }

}
