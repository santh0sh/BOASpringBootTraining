package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDAO;
import com.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDAO dao;

	public Product addProduct(Product Product) {
		return dao.save(Product);
	}

	public List<Product> getProducts() {
		return (List<Product>) dao.findAll();
	}

	public List<Product> getProductById(List<Long> productList) {
		return (List<Product>) dao.findAllById(productList);
	}

}
