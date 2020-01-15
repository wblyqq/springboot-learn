package com.springboot.demo3.service;

import com.springboot.demo3.mybean.User;

import java.util.List;

public interface userService{
    List<User> list(User user);

    Object get(User user);

    int Update(User user);

    int Save(User user);

    int delete(User user);
}
