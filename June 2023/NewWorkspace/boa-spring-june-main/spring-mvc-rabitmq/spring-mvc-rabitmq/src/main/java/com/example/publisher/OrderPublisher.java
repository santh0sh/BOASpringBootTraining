package com.example.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Order;
import com.example.dto.OrderStatus;
import com.example.mq.MessageConfig;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    
	@Autowired
	private RabbitTemplate template;
	@PostMapping("/{restName}")
	public String placeOrder(@RequestBody Order order,@PathVariable String restName) {
		
		order.setOrderId(UUID.randomUUID().toString());
		OrderStatus status= new OrderStatus(order, "Order Precessed...!", "Order Placed Successfully to  "+restName);
		template.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTING_KEY,status);
		
		return "Success...!";
	}
}