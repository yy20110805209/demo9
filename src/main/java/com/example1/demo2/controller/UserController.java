package com.example1.demo2.controller;
import com.example1.demo2.entity.User;
import com.example1.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //新增；
    @PostMapping("/add")
    public Boolean add(@RequestBody User user) {

        return userService.add(user);
    }

    //删除；
    @GetMapping("/delete/{id}")
    public Boolean del(@PathVariable int id) {
        return userService.removedById(id);
    }

    //修改
    @PostMapping("/update")
    public User update(@PathVariable Integer user) {
        return userService.getByid(user);
    }

    //查询
    @GetMapping("/get/{id}")
    public User get(@PathVariable int id) {
        return userService.getByid(id);
    }

    //查询全部
    @GetMapping("/list")
    public List<User> list() {
        return userService.queryList();
    }
}
