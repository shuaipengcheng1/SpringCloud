package com.misaka.openfeignconsumer.Config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feign(){
        return Logger.Level.FULL;
    }
}