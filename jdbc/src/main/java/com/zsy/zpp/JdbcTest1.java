package com.zsy.zpp;

import org.junit.Test;

import java.sql.*;

public class JdbcTest1 {
    @Test
    public void Test() throws Exception {
        String url = "jdbc:mysql://192.168.159.201/test";
        String username = "root";
        String passwd = "z12345678Z.";
        Connection connection = DriverManager.getConnection(url, username, passwd);

        Statement statement = connection.createStatement();

//        String sql = "update zsy_test set title = '11' where id = 1";
        String sql = "select * from zsy_test limit 2";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println();
        }

        statement.close();
        connection.close();
    }

}
