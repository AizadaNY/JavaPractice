package org.example.week8;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        DBConnection db=new DBConnection();
         String url = "jdbc:sqlite:C:/Users/Aizada/database/test.db";
        db.getConnection(url);
    }



    private static final String url = "jdbc:sqlite:C:/Users/Aizada/database/test.db";
    public void executeQuery(String sqlQuery) {
        Statement statement = null;
        try {
            statement = getConnection(url).createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void executeQueryReturnResult(String sqlQuery) {
        Statement statement = null;
        try {
            statement = getConnection(url).createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                resultSet.getRow();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private Connection getConnection(String url) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("DB connection established successfully");

        } catch (SQLException e) {
            System.out.println("An error occurred while connecting SQLite database");
        }
        return connection;
    }
}
