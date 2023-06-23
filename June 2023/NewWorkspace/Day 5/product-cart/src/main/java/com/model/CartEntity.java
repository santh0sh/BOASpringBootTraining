

package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Builder
public class CartEntity {
	@Id
	private Long userId;
	private Long cartId;
	private Integer totalItems;
	private Double totalCosts;
	private String product;

}