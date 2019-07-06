package com.lovo.resourcesystem.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import com.google.gson.Gson;
import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.service.AcceptNeService;

public class MyMessageListener implements MessageListener {
	
	@Autowired
	private AcceptNeService acceptNeService;
	

	public void onMessage(Message msg) {
        if (msg instanceof TextMessage) {
            try {
                TextMessage txtMsg = (TextMessage) msg;
                String message = txtMsg.getText();
                Gson gson = new Gson();
                if(message.indexOf("eventName") != -1){
                AcceptNewsEntity a = gson.fromJson(message, AcceptNewsEntity.class);
                a.setState("未处理");
                acceptNeService.add(a);
                }
                System.out.println("点对点收到结果===" + message);
            } catch (JMSException e) {
            	e.printStackTrace();
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Message must be of type TextMessage");
        }
    }

}
