package com.misaka.openfeignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开启OpenFeign
@EnableFeignClients
public class OpenFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumerApplication.class, args);
    }

}
