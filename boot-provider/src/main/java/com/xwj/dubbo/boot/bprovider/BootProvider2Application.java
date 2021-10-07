package com.xwj.dubbo.boot.bprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(BootProvider2Application.class, args);
    }
}
