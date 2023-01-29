import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.mapper.UserMapper;
import org.example.mybatis.pojo.User;
import org.example.mybatis.utils.SqlSessionUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        int result = userMapper.insertUser();
//        int result = userMapper.updateUser();
//        List<User> users = userMapper.getAllUser();

//        users.forEach(System.out::println);

//        User zsy = userMapper.getUserByName("zsy");
        Map<String, String> map = new HashMap<>();
        map.put("username","wwy");
        map.put("password","150724");
        map.put("gender","女");
        map.put("age","18");
        map.put("email","123321312@gmail.com");
//        User zsy = userMapper.checkLogin(map);
//        System.out.println(result);
//        System.out.println(zsy);

//        userMapper.insertUserByMap(map);

//        User zsy = userMapper.checkLoginByPara("zsy", "150724");
        User user = new User(123,"wangwenya","123456",18,"女","123@qq.com");

        userMapper.insertUserByObject(user);
//        System.out.println(zsy);


        sqlSession.close();


    }
}
