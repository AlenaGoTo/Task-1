package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/mydb";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    private static Connection connection;

    // создание соединения с БД
    public static Connection openConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                System.out.println("Connection Failed");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
