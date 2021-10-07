package com.xwj.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ProviderApplication {
   /* public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }*/

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

        /*try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        while (true){

        }
    }
}
