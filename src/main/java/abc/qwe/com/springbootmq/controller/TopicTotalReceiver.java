package abc.qwe.com.springbootmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wangxufeng
 * @date 2020-04-16 11:30
 */
@Component
@RabbitListener(queues = "topic.woman")
public class TopicTotalReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("woman.......................................woman");
        System.out.println("TopicTotalReceiver消费者收到消息  : " + testMessage.toString());
    }
}
