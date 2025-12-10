package com.raj.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.raj.model.StockPrice;
@Component
public class StockPriceScheduler implements StockService {

	@Autowired
	private StockPrice stock;
	
	@Override
	@Scheduled(fixedRate = 4000)
	public void fetchLatestPrice() {
		
		System.out.println("Fetched price: "+stock.getCurrentPrice()+" for "+stock.getStockName()+" at "+new Date());
	}

}
