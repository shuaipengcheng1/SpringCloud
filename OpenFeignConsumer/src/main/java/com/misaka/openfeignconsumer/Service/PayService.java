package com.misaka.openfeignconsumer.Service;

import com.misaka.Domain.ReturnJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
//选取调用哪一个微服务
@FeignClient(value = "PAYMENT")
public interface PayService {
//    调用微服务的哪一个方法
@RequestMapping("/create/{Detail}")
public ReturnJson Create(@PathVariable(value = "Detail") String Detail);
    @RequestMapping("/timeout")
    public void Time();
}
