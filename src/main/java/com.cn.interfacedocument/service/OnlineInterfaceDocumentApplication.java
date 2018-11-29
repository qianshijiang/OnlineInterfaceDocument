package com.cn.interfacedocument.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by QSJ on 2018/11/29.
 */
@SpringBootApplication
@MapperScan(value = "com.cn.interfacedocument.dao")
public class OnlineInterfaceDocumentApplication {
    public static void main(String[] args) {
        /**
         * Spring boot 程序入口
         */
        SpringApplication.run(OnlineInterfaceDocumentApplication.class,args);
    }
}
