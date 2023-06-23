package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
 
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
	@Id
	@GeneratedValue
	private Long productId;
	private String productName;
	private String quantity;
	private String amount;
	
}
