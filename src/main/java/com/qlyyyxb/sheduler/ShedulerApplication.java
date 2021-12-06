package com.qlyyyxb.sheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ShedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShedulerApplication.class, args);
    }

}
