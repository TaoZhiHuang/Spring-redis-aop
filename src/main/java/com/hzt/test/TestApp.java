package com.hzt.test;

import com.hzt.domain.User;
import com.hzt.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Userservice userservice = context.getBean(Userservice.class);
//        List<User> list = userservice.queryAllUser();
//        for (User user : list) {
//            System.out.println(user);
//        }

//                User user=new User();
//        user.setName("黄212志桃");
//        user.setAddress("arto");
//        user.setBirth(new Date());
//        userservice.insert(user);


//        User user=new User();
//        user.setId(8);
//        user.setName("hzt");
//        user.setAddress("arto");
//        user.setBirth(new Date());
//        userservice.updateByPrimaryKey(user);

//        userservice.deleteByPrimaryKey(6);

        userservice.selectByPrimaryKey(2);
    }
}
