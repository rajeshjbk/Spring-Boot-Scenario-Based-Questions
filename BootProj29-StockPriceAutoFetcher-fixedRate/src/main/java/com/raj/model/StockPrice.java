package com.raj.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class StockPrice {

	@Value("${stock.id}")
	private int stockId;
	
    @Value("${stock.name}")
	private String stockName;
    
    @Value("${stock.price}")
	private double currentPrice;

	private Date fetchedTime;

}
