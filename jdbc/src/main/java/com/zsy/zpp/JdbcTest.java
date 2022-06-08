package com.zsy.zpp;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://192.168.205.111/mysql";
        String username = "root";
        String passwd = "z12345678Z.";
        Connection connection = DriverManager.getConnection(url, username, passwd);

        Statement statement = connection.createStatement();

        String sql = "select * from mysql.user limit 10";

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            String a = resultSet.getNString(1);
            System.out.println(a);
        }
        statement.close();
        connection.close();


    }
}
