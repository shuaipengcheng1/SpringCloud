package com.misaka.order_hystrix_800.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Service
@FeignClient(value = "PAY",fallback = PayServiceFallBack.class)
public interface PayService {
    @RequestMapping("/Pay")

    public Map get();
    @RequestMapping("/Delay")
    public Map Dalay();

}
