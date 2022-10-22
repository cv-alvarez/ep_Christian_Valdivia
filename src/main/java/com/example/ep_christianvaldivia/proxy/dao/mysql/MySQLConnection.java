package com.example.ep_christianvaldivia.proxy.dao.mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnection {
    public static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/ep1_artist";
    public static final String USER="root";
    public static final String PASS="root";
    public MySQLConnection() throws Exception{
        Class.forName(DRIVER);
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);

    }

}
