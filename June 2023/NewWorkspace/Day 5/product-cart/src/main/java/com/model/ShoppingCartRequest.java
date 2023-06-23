package com.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShoppingCartRequest {

	private Long userId;
	private Long cartId;
	private Integer totalItems;
	private Double cartValue;
	private List<Product> products;
}
