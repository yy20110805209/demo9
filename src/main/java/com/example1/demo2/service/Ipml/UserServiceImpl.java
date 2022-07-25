package com.example1.demo2.service.Ipml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example1.demo2.entity.User;
import com.example1.demo2.mapper.UserMapper;
import com.example1.demo2.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    //查询单个
    public User getByid(Integer id) {
        return getById(id);
    }

    @Override
    //查询所有
    public List<User> queryList() {
        return list();
    }
    @Override
    //修改
    public void modify(User user) {
        updateById(user);
    }
    @Override
    //删除
    public Boolean removedById(Integer id) {
        removeById(id);
        return null;
    }
    @Override
    //添加
    public Boolean add(User user) {
        save(user);
        return null;
    }
}

