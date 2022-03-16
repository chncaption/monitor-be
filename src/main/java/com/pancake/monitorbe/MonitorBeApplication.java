package com.pancake.monitorbe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pancake.monitorbe.dao")
public class MonitorBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorBeApplication.class, args);
    }

}
