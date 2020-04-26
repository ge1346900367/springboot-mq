package abc.qwe.com.springbootmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/*
* 监听队列消息
* */
@Component
@RabbitListener(queues = "topic.man")
public class MyListener {

    //    @RabbitListener(queues ="topic.man")
    @RabbitHandler
    public void test1(Map testMessage){
        System.out.println("man.......................................man");
        System.out.println("队列中的消息是"+testMessage.toString());
    }
}