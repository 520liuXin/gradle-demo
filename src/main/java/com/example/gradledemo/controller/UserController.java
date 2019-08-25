package com.example.gradledemo.controller;

import com.example.gradledemo.bean.Response;
import com.example.gradledemo.bean.UserInfo;
import com.example.gradledemo.bean.request.UserVo;
import com.example.gradledemo.dao.UserDao;
import com.example.gradledemo.utils.CheckUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author liuxin
 * @Description //TODO
 **/
@RestController
@RequestMapping(name = "/user")
public class UserController {
    @Autowired
    private UserDao userDao;


    @PostMapping(name = "/save")
    public Response userSave(@RequestBody UserVo userVo){
        UserInfo userInfo=userDao.findByUsername(userVo.getUsername());
        if(CheckUtils.isNotEmpty(userInfo)){
            return Response.fail("用户已存在，请勿重复注册");
        }

        return Response.success();



    }

}
