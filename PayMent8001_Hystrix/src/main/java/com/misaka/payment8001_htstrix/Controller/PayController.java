package com.misaka.payment8001_htstrix.Controller;

import com.misaka.payment8001_htstrix.service.PayServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PayController {
    @Autowired
    PayServcice payServcice;
    @RequestMapping("/Pay")
public Map get(){
        return payServcice.GetPay();
    }
    @RequestMapping("/Delay")
    public Map Dalay(){
        return payServcice.Delay();
    }
}
