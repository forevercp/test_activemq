package com.downjoy.activemq.service;
import javax.annotation.Resource;
import javax.jms.*;


import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
/**
* @Author: chen peng peng.chen@downjoy.com
*/
@Service
public class ConsumerService {
    @Resource(name="jmsTemplate")
    private JmsTemplate jmsTemplate;


    public TextMessage receive(Destination destination){
        TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
        try{
            if (textMessage != null) {
                System.out.println("从队列" + destination.toString() + "收到了消息：\t"
                        + textMessage.getText());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return textMessage;
    }
}