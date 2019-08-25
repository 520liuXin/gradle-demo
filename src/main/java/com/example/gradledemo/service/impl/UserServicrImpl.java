package com.example.gradledemo.service.impl;

import com.example.gradledemo.bean.UserInfo;
import com.example.gradledemo.dao.UserDao;
import com.example.gradledemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * @Author liuxin
 * @Description //TODO
 **/
public class UserServicrImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserInfo save(UserInfo userInfo) {
        UserInfo user =userDao.save(userInfo);

        return user;
    }

    @Override
    public UserInfo findByUserName(String username) {
        UserInfo user=userDao.findByUsername(username);

        return null;
    }
}
