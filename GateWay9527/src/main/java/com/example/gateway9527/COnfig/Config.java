package com.example.gateway9527.COnfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        // id                   // 路由         //映射路径 http://baidu.com/hello
        builder.route("test", r -> r.path("/hello").uri("https://baidu.com")).build();
        // id                   // 路由         //映射路径 http://localhost:7001/pay/**
        builder.route("testx", r -> r.path("/pay/**").uri("https://localhost:7001")).build();
                                                                                  //https://news.baidu.com/game
        builder.route("/BV18E411x7eT?p=70&spm_id_from=pageDriver",r->r.path("/game").uri("https://news.baidu.com/")).build();
        return builder.build();

    }
}
