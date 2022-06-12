package com.zsy.zpp;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class JdbcTest3_druid {

    @Test
    public void test() throws Exception {

        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection connection = dataSource.getConnection();

        System.out.println(connection);
    }
}
