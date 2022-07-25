package com.example1.demo2.service;

import com.example1.demo2.entity.User;

import java.util.List;

/**
 *      students表的增删改查
 */
public interface UserService {

    //查询：
    User getByid(Integer id);

    //查询全部：
    List<User> queryList();

    //修改
    void modify(User user);

    //删除
    Boolean removedById(Integer id);

    //添加
    Boolean add(User user);
}
