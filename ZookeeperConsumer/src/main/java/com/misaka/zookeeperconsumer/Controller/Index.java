package com.misaka.zookeeperconsumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class Index {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/consumer/zk")
    public Map g(){
        return restTemplate.getForObject("http://localhost:8004/zk",Map.class);

    }

}
