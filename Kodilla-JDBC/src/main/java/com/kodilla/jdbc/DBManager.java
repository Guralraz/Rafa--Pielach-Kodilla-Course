package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DBManager {

    INSTANCE;

    private Connection connection;

    DBManager() {
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "Kodilla_User");
        connectionProperties.put("password", "kodilla_Pass123");
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_course" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",                                  // [10]
                    connectionProperties);
        } catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DBManager getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

}
