package com.hzt.service.impl;

import com.hzt.domain.User;
import com.hzt.mapper.UserMapper;
import com.hzt.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 
*
* @Author:hzt
* @Date:12:48 上午 2020/7/2
*/
@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserMapper userMapper;

    public int deleteByPrimaryKey(Integer id) {
        return this.userMapper.deleteByPrimaryKey(id);
    }

    public User insert(User user) {
        this.userMapper.insert(user);
        return user;
    }

    public User selectByPrimaryKey(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public User updateByPrimaryKey(User user) {
        int index = this.userMapper.updateByPrimaryKey(user);
        return user;
    }

    public List<User> queryAllUser() {
        return this.userMapper.queryAllUser();
    }
}
