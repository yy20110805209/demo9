package com.example1.demo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "students")
public class User {
    @TableId(value = "id",type = IdType.AUTO)  //@Table这条数据自增长也是对应数据库自增长的；
    private Integer id;
    private String name;
    private Integer age;

    //get,set方法：
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "User{" +
                "id="+id+
                ",name'"+name+'\''+
                ",age="+ age +
                "}";
    }
}
