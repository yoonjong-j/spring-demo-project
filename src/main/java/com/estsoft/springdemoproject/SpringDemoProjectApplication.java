package com.estsoft.springdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // @ComponentScan도 포함하는 어노테이션
public class SpringDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoProjectApplication.class, args);
    }

}