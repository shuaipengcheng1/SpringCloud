package com.misaka.streamconsumer2.Service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableBinding({Sink.class})
public class ReciveService {
    @StreamListener(Sink.INPUT)
    public void message(Message<String> message){
        System.out.println("消息"+message.getPayload());
    }
}
