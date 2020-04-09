package com.kk.easycode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kk.easycode.dao")
@SpringBootApplication
public class SpringBootEasycodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEasycodeApplication.class, args);
    }

}
