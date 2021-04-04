package com.jackguo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jackguo.Dao")
public class CarcmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarcmsApplication.class, args);
    }

}
