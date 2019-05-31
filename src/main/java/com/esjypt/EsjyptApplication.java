package com.esjypt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.esjypt.mapper")
public class EsjyptApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsjyptApplication.class, args);
        System.out.println("=================================");
        System.out.println("=============启动成功===============");
        System.out.println("=================================");
    }

}
