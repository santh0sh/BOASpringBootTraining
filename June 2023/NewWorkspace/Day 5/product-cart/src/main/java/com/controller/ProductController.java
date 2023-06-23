
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.ShoppingCartRequest;
import com.model.ShoppingCartResponse;
import com.service.ShoppingService;

@RestController
@EnableEurekaClient
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ShoppingService service;

	@PostMapping("/{userid}/products")
	public ResponseEntity addProducts(
			@PathVariable Long userid,
			@RequestBody List<ShoppingCartRequest> reqprodlist) {
		
		ShoppingCartResponse response= service.processAndRequest(userid, reqprodlist);
		return new ResponseEntity(response,HttpStatus.CREATED);

	}

	 

}