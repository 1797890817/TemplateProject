package com.ddbin.eflow.center.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    //开启组件扫描和自动配置
public class EflowCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EflowCenterApplication.class, args);
    }
}
