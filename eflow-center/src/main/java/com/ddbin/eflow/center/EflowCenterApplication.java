package com.ddbin.eflow.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication    //开启组件扫描和自动配置,等效于下面的三个注解
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class EflowCenterApplication {//我们通常建议您将主应用程序类定位到其他类之上的根包中---来自官网手册

    public static void main(String[] args) {
        SpringApplication.run(EflowCenterApplication.class, args);
    }
}
