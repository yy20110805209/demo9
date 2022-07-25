package com.example1.demo2.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example1.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
