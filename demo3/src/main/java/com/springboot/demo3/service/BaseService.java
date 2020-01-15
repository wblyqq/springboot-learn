package com.springboot.demo3.service;

import java.util.List;

public interface BaseService<T> {
     public List<T> list(T entity);
     public T get(T entity);
     public int Update(T entity);
     public int Save(T entity);
     public int delete(T entity);
}
