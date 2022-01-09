package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/newdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static Connection uConnection(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Драйвер не найден.");
        }
        return connection;
    }
    // реализуйте настройку соеденения с БД
}
