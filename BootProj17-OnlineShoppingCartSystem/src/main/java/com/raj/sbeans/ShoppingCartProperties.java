package com.raj.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix = "cart")
public class ShoppingCartProperties {

	private String user;

	private double totalAmount;

	private int[] quantities;

	private List<String> items;

	private Set<String> coupons;

	private Map<String, Integer> prices;
}
