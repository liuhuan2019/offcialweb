package com.lh.mapper;


import com.lh.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {


    @Select("SELECT * from `user` ")
    List<User> findAll();


    @Select("SELECT * from user WHERE username=#{username} and password=#{password}")
    User findByUser(@Param("username") String username,@Param("password")String password);
}
