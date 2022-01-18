package com.misaka.order_hystrix_800;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class OrderHystrix800Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrix800Application.class, args);
    }

}
