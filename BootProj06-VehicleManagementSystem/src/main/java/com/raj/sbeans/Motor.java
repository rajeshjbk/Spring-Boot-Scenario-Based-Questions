package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {

	@Value("${motor.type}")
	String motorType;
	
	@Value("${motor.power}")
	int motorPower;
	
	@Autowired
	Fuel fuel;

	@Override
	public String toString() {
		return "Motor [motorType=" + motorType + ", motorPower=" + motorPower + ", fuel=" + fuel + "]";
	}	
}
