package com.ddbin.eflow.center.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by deepin on 17-8-8.
 */
@Getter
@Setter
public class BaseEntity {
    @Id
    private Long id;
    private Long domain;    //为不同的公司使用做准备，故需要有domain的标识字段
}
