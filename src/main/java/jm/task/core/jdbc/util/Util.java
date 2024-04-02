package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/mydb";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    private static Connection connection;
    private static SessionFactory sessionFactory;

    // создание соединения с БД
    // openConnection для JDBC
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

    // openConnection для Hibernate
    public static SessionFactory createSessionFactory () {
        sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .buildSessionFactory(); // По умолчанию будет использован файл hibernate.properties
        return sessionFactory;
    }
}
