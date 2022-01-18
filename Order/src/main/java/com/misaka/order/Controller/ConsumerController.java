package com.misaka.order.Controller;

import com.misaka.Domain.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
//    消费者 要 消费8001端口的服务

    @Autowired
    RestTemplate restTemplate;

//    使用RestTemplte 发送

@RequestMapping("/consumer/create/{Detail}")
    public PayMent create(@PathVariable  String Detail){
//        发送请求
        return restTemplate.getForObject("http://PAYMENT"+"/create/"+Detail,PayMent.class);

    }
//    查看id

@RequestMapping("/consumer/serch/{id}")
    public PayMent Seach(@PathVariable Integer id){
        return restTemplate.getForObject("http://PAYMENT"+"/serch/"+id,PayMent.class);
    }
}
