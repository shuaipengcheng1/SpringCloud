package com.misaka.order_hystrix_800.Service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class PayServiceFallBack implements PayService {
    @Override
    public Map get() {
        Map map =new HashMap();
        map.put("state","fallback");
        return map;
    }

    @Override
    public Map Dalay() {
        Map map =new HashMap();
        map.put("state","fallback");
        return map;
    }
}
