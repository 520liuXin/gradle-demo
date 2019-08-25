package com.example.gradledemo.bean;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Size;

/*
 * @Author liuxin
 * @Description //TODO
 **/
@Data
public class UserVo {


        private Long uid;

        private String username;



        private String password;


}
