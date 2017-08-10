package com.ddbin.eflow.center.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by deepin on 17-8-8.
 */
@Entity
@Getter@Setter
public class Employee {
    @Id
    private Long id;
    private Long domain;    //为不同的公司使用做准备，故需要有domain的标识字段
    private String name;
    private Byte sex;       //0-male,1-female
    private String email;
    private int level=10;  //1-10,10 is default
    private String tel;    //fixed telephone
    private String mobile;  //mobile phone
    private String address; //address
    private String directSupervisor;    //直接领导
    //private List<Employee> hasEmployee; //下属成员

}
