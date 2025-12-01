package com.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

	private int pId;
	
	@NonNull
	private String pName;
	@NonNull
	private Double price;
	@NonNull
	private String category;

}
