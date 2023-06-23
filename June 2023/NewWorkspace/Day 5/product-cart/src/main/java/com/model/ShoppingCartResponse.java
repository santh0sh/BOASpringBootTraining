package com.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShoppingCartResponse {

	private Long userId;
	private Long cartId;
	private Integer totalItems;
	private Double totalCosts;
	private List<Product> products;

	
}
