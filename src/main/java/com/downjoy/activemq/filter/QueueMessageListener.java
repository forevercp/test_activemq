package com.downjoy.activemq.filter;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 *@Author: chen peng peng.chen@downjoy.com
 * @CreateDate:     2018/5/14 14:39  
*/
public class QueueMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("QueueMessageListener监听到了文本消息：\t"
                    + tm.getText());
            //do something ...
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}