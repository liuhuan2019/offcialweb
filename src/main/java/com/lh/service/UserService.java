package com.lh.service;


import com.lh.mapper.UserMapper;
import com.lh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public String findByUser(String username,String password) {
        User user=userMapper.findByUser(username,password);

       /* if (user.getUsername()!=username) {
            return "用户名错误";
        }
        if (user.getUsername()==username && !user.getPassword().equals(password)){
            return "密码错误";
        }*/
        if (user==null){
             return "用户和密码错误";
        }
        if (!user.getPassword().equals(password)){
            return "密码错误";
        }
        return "登录成功";
    }
}
