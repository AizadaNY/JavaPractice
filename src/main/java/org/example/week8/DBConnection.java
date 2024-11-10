package org.example.week8;

import java.sql.*;

public class DBConnection {

    private static final String url="";



    {



    }

    private Connection getConnection(String url){
        Connection connection;
        try {
            connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("");
            while (resultSet.next()){
                resultSet.getRow();
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while connecting SQLite database");
        }
    }
}
