package com.misaka.stream_provider.Controller;

import com.misaka.stream_provider.Service.PayServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @Autowired
    PayServiceImpl payService;
   @HystrixCommand
    @RequestMapping("/pay/{id}")
    public String p(@PathVariable("id")int id){
       if(id<0){
           throw new RuntimeException();
       }else
        return payService.pay(id);
    }
}
