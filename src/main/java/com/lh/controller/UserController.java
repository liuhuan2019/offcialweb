package com.lh.controller;

import com.lh.pojo.User;
import com.lh.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "获取用户")
    @GetMapping("/all")
    public List<User> findAll(){
       List<User> users=userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
       return  users;
    }


    /**
     *根据传入参数判断能否登录
     */
    @ApiOperation(value = "登录验证")
    @RequestMapping("/login")
    public String findByUser(String username,String password){
        String message=userService.findByUser(username,password);
        return message;
    }



    /*@GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
        System.out.println(id);
        return "根据id获取用户信息";
    }*/

    /*@PostMapping("/user")
    public String save(){
        return "添加用户";
    }*/




}
