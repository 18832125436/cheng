package com.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.dao")
public class Ceshi3Application {
    public static void main(String[] args) {
        SpringApplication.run(Ceshi3Application.class, args);
    }

}
