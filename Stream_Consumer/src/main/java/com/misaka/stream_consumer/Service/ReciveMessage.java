package com.misaka.stream_consumer.Service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class ReciveMessage {
//    接收消息的类
    @StreamListener(Sink.INPUT)
    public void message(Message<String> message){
        System.out.println("我是消费者 消息为"+message.getPayload());
    }
}
