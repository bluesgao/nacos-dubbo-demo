package com.bluesgao.ndd;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class NddConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NddConsumerApplication.class, args);
    }
}
