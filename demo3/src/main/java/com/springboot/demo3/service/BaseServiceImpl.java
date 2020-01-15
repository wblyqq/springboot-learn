package com.springboot.demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
    @SuppressWarnings("all")
    @Autowired
    private Mapper<T> mapper; //泛型装配

    @Override
    public List<T> list(T entity) {
        return mapper.select(entity);
    }

    @Override
    public T get(T entity) {
        return mapper.selectOne(entity);
    }

    @Override
    public int Update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int Save(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int delete(T entity) {
        return mapper.deleteByPrimaryKey(entity);
    }
}
