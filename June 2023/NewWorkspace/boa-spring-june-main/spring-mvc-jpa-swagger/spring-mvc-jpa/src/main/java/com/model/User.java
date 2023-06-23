package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
 

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@ApiModel(description = "Details about user data")
public class User {
	@Id
	@ApiModelProperty(notes = "Expected unique value")
	private String uname;
	@ApiModelProperty(notes = "Expected password from user")
	private String pass;
	private String email;
	private String city;
	
	

}
