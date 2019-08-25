package com.example.gradledemo.bean.request;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.io.Serializable;

/*
 * @Author liuxin
 * @Description //TODO
 **/
@Data
public class UserVo {

    @NonNull
    private Long uid;

    @NonNull
    private String username;


    @Size(min = 1,max = 5)
    private String password;
}
