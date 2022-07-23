package com.rick.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.rick.clients"
)
public class CustomerApplication {
    @Value("${rick.test}")
    private static String t;
    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);
        System.out.println(t);
    }
}
