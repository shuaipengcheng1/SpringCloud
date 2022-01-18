package com.misaka.zookeeperprovider.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class Test {
    @RequestMapping("/zk")
    public Map g(){
        Map map =new HashMap();
        map.put("hello", UUID.randomUUID().toString());
        return map;
    }
}
