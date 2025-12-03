package com.raj.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "customer")
public class CustomerConfig {

	private long accountNo;

	private String holderName;

	private String branch;

	private double[] balances;

	private List<String> accountTypes;

	private Set<String> documents;

	private Map<String, Double> interestRates;

	private Map<String, Integer> transactions;
}
