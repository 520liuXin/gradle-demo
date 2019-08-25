package com.example.gradledemo.controller;

import com.example.gradledemo.bean.UserInfo;
import com.example.gradledemo.bean.request.UserVo;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * @Author liuxin
 * @Description //TODO
 **/
@SpringBootTest
public class UserControllerTest {



    @Test
    public void userSaveTest(){
        com.example.gradledemo.bean.UserVo userVo=new com.example.gradledemo.bean.UserVo();
        userVo.setUid(743824792L);
        userVo.setUsername("dadad");
        userVo.setPassword("432492842");



    }

}
