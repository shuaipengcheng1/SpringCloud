package com.misaka.Controller;

import com.misaka.Domain.PayMent;
import com.misaka.Domain.ReturnJson;
import com.misaka.Service.PayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Controller {
    @Autowired
    PayServiceImpl payService;
    @Value("${server.port}")
    String Port;
    @RequestMapping("/create/{Detail}")
    public ReturnJson Create(@PathVariable String Detail){
//        创建一个随机数
        String s = String.valueOf(Math.random()*100000);
        PayMent payMent =new PayMent(s,Detail);
      Boolean state=  payService.CreatePay(payMent);
      if(state){
          return new  ReturnJson(200,Detail);
      }else {
          return new  ReturnJson(403,null);
      }
    }
//    查找
    @RequestMapping("/serch/{id}")
    public PayMent Serch(@PathVariable int id){
        System.out.println("服务"+Port);
       return payService.GetPayMentById(id);
    }
    @RequestMapping("/timeout")
    public void Time(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
