package com.example.gradledemo.service;

import com.example.gradledemo.bean.UserInfo;
import org.springframework.stereotype.Service;

/*
 * @Author liuxin
 * @Description //TODO
 **/
@Service
public interface UserService {

    UserInfo save(UserInfo userInfo);

    UserInfo findByUserName(String username);

}
