package com.example.gradledemo.dao;

import com.example.gradledemo.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @Author liuxin
 * @Description //TODO
 **/

public interface UserDao extends JpaRepository<UserInfo,Long> {

    UserInfo findByUsername(String username);
}
