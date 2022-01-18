package com.misaka.openfeignconsumer.Consumer;

import com.misaka.Domain.ReturnJson;
import com.misaka.openfeignconsumer.Service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    PayService payService;
    @RequestMapping("/create/{Detail}")
    public ReturnJson Create(@PathVariable String Detail){
        return payService.Create(Detail);
    }
    @RequestMapping("/time")
    public void Time(){
//        延时
        payService.Time();
    }
}
