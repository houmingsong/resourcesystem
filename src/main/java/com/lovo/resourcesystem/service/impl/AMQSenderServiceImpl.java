package com.lovo.resourcesystem.service.impl;

import javax.jms.JMSException;
import javax.jms.Session;

import org.apache.activemq.Message;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.lovo.resourcesystem.service.AmqSenderService;

@Service("amqSenderService")
public class AMQSenderServiceImpl implements AmqSenderService{
	  private static final Logger logger = Logger.getLogger(AMQSenderServiceImpl.class);

	    @Autowired
	    private JmsTemplate jmsTemplate;

	    //目的地队列的明证，我们要向这个队列发送消息
	   @Autowired
	    private ActiveMQQueue resourceToDispatch;
        
         
	    //向特定的队列发送消息
	    @Override
	    public void sendMsgQueue(String msg) {
	       
	        try {
	            logger.info("将要向队列{}发送的消息msg:{}"+resourceToDispatch+ msg);
	            jmsTemplate.send(resourceToDispatch, new MessageCreator() {
	                @Override
	                public Message createMessage(Session session) throws JMSException {
	                    return (Message) session.createTextMessage(msg);
	                }
	            });

	        } catch (Exception ex) {
	            logger.error("向队列{}发送消息失败，消息为：{}"+resourceToDispatch+ msg);
	        }

	    }
		@Override
		public void sendMsgTopic(String msg) {
			try {
	            logger.info("将要向订阅{}发送的消息msg:{}"+resourceToDispatch+ msg);
	            jmsTemplate.send(resourceToDispatch, new MessageCreator() {
	                @Override
	                public Message createMessage(Session session) throws JMSException {
	                    return (Message) session.createTextMessage(msg);
	                }
	            });

	        } catch (Exception ex) {
	            logger.error("向队列{}发送消息失败，消息为：{}"+resourceToDispatch+ msg);
	        }
			
		}
		public void sendOverMessage1(final Object obj){
			final Gson gson=new Gson();
			final String json = gson.toJson(obj);
			System.out.println(json);
			jmsTemplate.send(resourceToDispatch,new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					final Message message = (Message) session.createTextMessage(json);
					return message;
				}
				
			});
		}
		public void sendOverMessage2(final Object obj){
			final Gson gson=new Gson();
			final String json = gson.toJson(obj);
			System.out.println(json);
			jmsTemplate.send(resourceToDispatch,new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					final Message message = (Message) session.createTextMessage(json);
					return message;
				}
				
			});
		}
		public static void main(String[] args) {
			AMQSenderServiceImpl k=new AMQSenderServiceImpl();
			k.sendMsgTopic("qwe");
		}
}
