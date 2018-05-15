package com.downjoy.activemq.task;

import com.downjoy.activemq.service.ConsumerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

@Service
public class MyTask {
    //队列消息消费者
    @Resource(name = "consumerService")
    private ConsumerService consumer;

    @Resource(name = "demoQueueDestination")
    private Destination destination;
    @Scheduled(cron = "0/10 * * * * *")
    private void getMessage(){
        System.out.println("定时器执行");
        consumer.receive(destination);
    }
}
