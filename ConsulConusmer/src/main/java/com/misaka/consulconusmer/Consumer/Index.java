package com.misaka.consulconusmer.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class Index {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/Consumer")
    public Map map(){
        return restTemplate.getForObject("http://localhost:8007/service",Map.class);
    }
}
