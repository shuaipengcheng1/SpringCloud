package com.misaka.payment8001_htstrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@DefaultProperties(defaultFallback = "def")
public class PayServcice {
    public Map GetPay() {
        Map map = new HashMap();
        map.put("成功", "成功");
        return map;
    }

    //    延迟
//    @HystrixCommand(fallbackMethod ="fallback" ,commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000") //最长响应时间 超过就使用服务降级
//    })

    @HystrixCommand
    public Map Delay() {
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map map = new HashMap();
        map.put("成功", "成功");
        return map;

    }
    //    服务降级的方法
    public Map fallback(){
        Map map =new HashMap();
              map.put("state", "失败");
              return map;
    }

    public Map def(){
        Map map =new HashMap();
        map.put("state", "全局");
        return map;
    }
}
