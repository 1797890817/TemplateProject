package com.ddbin.eflow.center.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by deepin on 17-8-8.
 */
@Entity
@Setter
@Getter
public class User extends BaseEntity {
    private String userName;
    private String password;
    private String role;    //角色
    private Boolean isEnable;   //是否启用

}
