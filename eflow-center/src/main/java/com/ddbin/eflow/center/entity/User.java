package com.ddbin.eflow.center.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by deepin on 17-8-8.
 */
@Entity
@Setter
@Getter
public class User extends BaseEntity implements UserDetails {
    @Id
    private String username;
    private String fullname;
    private String password;
    private String role;    //角色：user, admin
    private Boolean accountNonExpired=true;      //不过期
    private Boolean accountNonLocked=true;       //不加锁
    private Boolean credentialsNonExpired=true;   //是否启用
    private Boolean enable=true;   //是否启用

    // UserDetails methods
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }

    //不过期
    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    //不锁定
    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    //不会被撤销
    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    // 不禁用
    @Override
    public boolean isEnabled() {
        return this.enable;
    }




}
