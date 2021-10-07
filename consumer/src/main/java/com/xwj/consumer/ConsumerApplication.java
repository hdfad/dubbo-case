package com.xwj.consumer;

import com.xwj.consumer.service.impl.OrderService;
import com.xwj.interfaces.bean.UserAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConsumerApplication.class, args);
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

        OrderService orderService = classPathXmlApplicationContext.getBean(OrderService.class);

        List<UserAddress> userAddresses = orderService.initOrder();
        System.out.println(userAddresses);

        while(true){

        }
    }
}
