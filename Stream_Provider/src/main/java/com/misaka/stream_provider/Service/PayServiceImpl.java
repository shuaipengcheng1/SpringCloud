package com.misaka.stream_provider.Service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
@EnableBinding(Source.class) //定义该类是消息的推送管道
@DefaultProperties(defaultFallback = "fallback")
public class PayServiceImpl implements PayService {
    @Qualifier("output")// 多个bean 所以使用限定符
    @Autowired
    public  MessageChannel channel; // 消息发送管道

    @Override
    public String pay(int id) {
//       发送信息
        String s = UUID.randomUUID().toString();
        Map map = new HashMap();
        map.put("id",s);
        map.put("payment",id);
        channel.send(MessageBuilder.withPayload(map).build());
        return "订单";
    }

    public String fallback() {
        return "fallback";
    }

}
