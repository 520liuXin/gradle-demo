package com.example.gradledemo.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/*
 * @Author liuxin
 * @Description //TODO
 **/

@Entity
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    /**
        用户id;
     */
    private long uid;


    /**
     *  用户名
     */
    @Column(length = 255)
    private String username;


    /**
     * 密码
     */
    @Column(length = 255)
    private String password;

}
