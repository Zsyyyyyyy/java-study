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

        String user_name = "zsy";
        String pass_word = "'or '1' = '1";
        // 'or '1' = '1

//        String sql = "update zsy_test set title = '11' where id = 1";
        String sql = "select * from zsy_user where username = '" + user_name + "' and password = '" + pass_word+ "'";


        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()) {
            System.out.println("登录成功~");
        } else {
            System.out.println("登录失败~");
        }

        statement.close();
        connection.close();
    }

}
