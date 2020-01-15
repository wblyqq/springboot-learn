package com.springboot.demo3.controller;

import com.springboot.demo3.mybean.User;
import com.springboot.demo3.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class userController {
    @Autowired
    userService userService;

    @RequestMapping("list")
    public List<User> list(User user) {
        return userService.list(user);
    }

    @RequestMapping("get")
    public User get(User user) {
        return (User) userService.get(user);
    }

    @RequestMapping("update")
    public int update(User user) {
        return userService.Update(user);
    }

    @RequestMapping("save")
    public int save(User user) {
        return userService.Save(user);
    }

    @RequestMapping("delete")
    public int delete(User user) {
        return userService.delete(user);
    }
}
