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
public class Employee {

	private int eId;
	
	@NonNull
	private String eName;
	@NonNull
	private String dept;
	@NonNull
	private double sal;
	
}
