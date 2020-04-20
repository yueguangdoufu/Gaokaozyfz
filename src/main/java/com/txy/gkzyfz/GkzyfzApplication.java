package com.txy.gkzyfz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.txy.gkzyfz.pojo")
public class GkzyfzApplication {

    public static void main(String[] args) {
        SpringApplication.run(GkzyfzApplication.class, args);
    }

}
