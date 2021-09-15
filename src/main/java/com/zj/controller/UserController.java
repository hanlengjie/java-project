package com.zj.controller;

import com.zj.entity.User;
import com.zj.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/log0inEmp")
    @ResponseBody
    public int loginEmp(User user){
        int restlt = userService.queryUserByName(user);
        return restlt;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public void addUser(@RequestBody User user){
        userService.insertUser(user);
    }
}

