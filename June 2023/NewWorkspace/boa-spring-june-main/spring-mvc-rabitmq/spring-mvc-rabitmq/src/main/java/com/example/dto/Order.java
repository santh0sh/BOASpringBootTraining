package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Order {

	private String orderId;
	private String name;
	private String qty;
	private double price;
}
