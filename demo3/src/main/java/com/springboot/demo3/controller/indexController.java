package com.springboot.demo3.controller;

import com.springboot.demo3.mapper.UserMapper;
import com.springboot.demo3.mybean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class indexController {
    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/getData")
    @ResponseBody
    public String getlist(){
        List<User> users = userMapper.list2();
        String result="";
        for(int i=0;i<users.size();i++){
           result+=users.get(i).getUserId()+users.get(i).getPassword()+users.get(i).getUserName();
        }
        return result;
    }
}
