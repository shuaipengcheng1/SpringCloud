package com.misaka.order_hystrix_800.COntroller;

import com.misaka.order_hystrix_800.Service.PayService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class index {
    @Autowired
    PayService payService;
    @RequestMapping("/consuemr/pay")
    public Map pay(){
        return payService.get();
    }
    @RequestMapping("/consuemr/delay")
//@HystrixCommand(fallbackMethod = "fallback",commandProperties = {
//        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000") //最长响应时间 超过就使用服务降级
//
//})
    public Map delay(){
        return payService.Dalay();
    }

    public Map fallback(){
        Map map =new HashMap();
        map.put("state",false);
        return map;
    }

}
