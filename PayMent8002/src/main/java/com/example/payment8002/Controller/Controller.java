package com.example.payment8002.Controller;

import com.example.payment8002.Service.PayServiceImpl;
import com.misaka.Domain.PayMent;
import com.misaka.Domain.ReturnJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${server.port}")
    String Port;
    @Autowired
    PayServiceImpl payService;
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
