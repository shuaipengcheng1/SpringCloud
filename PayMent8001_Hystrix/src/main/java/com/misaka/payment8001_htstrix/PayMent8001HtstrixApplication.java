package com.misaka.payment8001_htstrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PayMent8001HtstrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayMent8001HtstrixApplication.class, args);
    }

}
