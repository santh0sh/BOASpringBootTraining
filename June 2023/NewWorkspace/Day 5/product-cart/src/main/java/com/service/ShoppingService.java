package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.dao.CartDAO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.CartEntity;
import com.model.Product;
import com.model.ShoppingCartRequest;
import com.model.ShoppingCartResponse;

@Service
public class ShoppingService {
	@Autowired
	@Qualifier("webclient")
	private WebClient.Builder builder;
	@Autowired
	private CartDAO dao;
	
	public ShoppingCartResponse processAndRequest(Long userId, List<ShoppingCartRequest> shoppingCartRequessRequestList) {
		// call Product API
		
		
		ObjectMapper mapper= new ObjectMapper();
		String productServiceUrl="http://localhost:8080/products/getProduct"+shoppingCartRequessRequestList.stream()
		.map(e -> String.valueOf(e.getProductId())).collect(Collectors.joining(","));
		List<Product> productServiceList= builder.build()
				.get()
				.uri(productServiceUrl)
				.retrieve()
				.bodyToFlux(Product.class)
				.collectList()
				.block();
		System.out.println(productServiceUrl);
		System.out.println(productServiceList);
		
		//calculate the cost of cart
		
		final Double[] totalCost= {0.0};
		productServiceList.forEach(ps1 -> {
			shoppingCartRequessRequestList.forEach(scr -> {
				if(ps1.getProductId() == scr.getProductId()) {
					ps1.setQuantity(scr.getQuantity());
					totalCost[0]=totalCost[0]+ ps1.getAmount() * scr.getQuantity();
				}
			});
		});
		// create cartEntity and add the data
		
		CartEntity cartEntity=null;
		try {
			cartEntity= CartEntity.builder()
					.userId(userId)
					.cartId((long)(Math.random()*Math.pow(10, 10)))
					.totalItems(productServiceList.size())
					.totalCosts(totalCost[0])
					.product(mapper.writeValueAsString(productServiceList))
					.build();
					
		}catch (Exception e) {}
		//save the data
		cartEntity=dao.save(cartEntity);
		
		// print the summary
		ShoppingCartResponse response= ShoppingCartResponse.builder()
				.cartId(cartEntity.getCartId())
				.totalItems(cartEntity.getTotalItems())
				.totalCosts(cartEntity.getTotalCosts())
				.products(productServiceList)
				.build();
		return response;
	}

}