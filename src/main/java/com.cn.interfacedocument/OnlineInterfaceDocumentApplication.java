package com.cn.interfacedocument;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
    //配置mybatis的分页插件pageHelper
    /*@Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }*/
}
