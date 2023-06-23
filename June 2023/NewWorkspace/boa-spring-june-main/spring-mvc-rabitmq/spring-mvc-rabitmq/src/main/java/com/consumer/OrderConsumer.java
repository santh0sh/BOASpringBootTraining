package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.dto.OrderStatus;
import com.example.mq.MessageConfig;



@Component
public class OrderConsumer {

	@RabbitListener(queues = MessageConfig.QUEUE)
	public void consumeMessage(OrderStatus orderStatus) {
		System.out.println("order received from "+ orderStatus);
	}
}
