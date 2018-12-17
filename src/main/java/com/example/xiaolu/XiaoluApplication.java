package com.example.xiaolu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.xiaolu.mapper")
@SpringBootApplication
public class XiaoluApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoluApplication.class, args);
    }
}
