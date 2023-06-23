package com.pack2;

import org.springframework.stereotype.Component;

@Component(value="sh")
public class Spring3HelloWorld {
	public void sayHello(){
		System.out.println("Hello Spring 3.0");
	}
}
