package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    int insertUser();

    int updateUser();

    List<User> getAllUser();

    User getUserByName(String username);

    User getUserById(int id);


    User checkLogin(Map map);

    int insertUserByMap(Map map);

    /* 通过实体类传参 */
    int insertUserByObject(User user);

    /* 通过param注解传参*/
    User checkLoginByPara(@Param("username") String username, @Param("password") String password );

}
