package com.example.consulprovider.Provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PayService {
    @RequestMapping("/service")
    public Map g(){
        Map map =new HashMap();
        map.put("state",200);
        return map;
    }
}
