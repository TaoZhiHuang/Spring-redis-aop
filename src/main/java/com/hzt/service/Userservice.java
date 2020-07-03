package com.hzt.service;

import com.hzt.domain.User;

import java.util.List;

public interface Userservice  {

    int deleteByPrimaryKey(Integer id);

    User insert(User user);

    User selectByPrimaryKey(Integer id);


    User updateByPrimaryKey(User user);

    List<User> queryAllUser();


}
