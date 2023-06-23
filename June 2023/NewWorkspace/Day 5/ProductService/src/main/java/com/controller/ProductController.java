package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.ProductService;

@RestController
@RequestMapping("/products")
@EnableEurekaClient
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProduct() {
		return productService.getProducts();
	}
	
	@GetMapping("/getProduct{pid}")
	public List<Product> getProductById(@PathVariable List<Long> pid) {
		return productService.getProductById(pid);
	}
}
