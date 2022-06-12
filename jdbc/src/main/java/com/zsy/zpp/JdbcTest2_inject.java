package com.zsy.zpp;

import org.junit.Test;

import java.sql.*;

public class JdbcTest2_inject {
    @Test
    public void test1() throws Exception {
        String url = "jdbc:mysql://192.168.159.201/test";
        String username = "root";
        String passwd = "z12345678Z.";
        Connection connection = DriverManager.getConnection(url, username, passwd);

        Statement statement = connection.createStatement();

        String user_name = "zsy";
        String pass_word = "'or '1' = 1'";
        // 'or '1' = 1'

//        String sql = "update zsy_test set title = '11' where id = 1";
        String sql = "select * from zsy_user where username = ? and password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,user_name);
        preparedStatement.setString(2,pass_word);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            System.out.println("登录成功~");
        } else {
            System.out.println("登录失败~");
        }

        statement.close();
        connection.close();
    }
}
