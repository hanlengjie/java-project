package com.zj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zj.dao")
public class ZjEmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjEmsApplication.class, args);
    }

}
