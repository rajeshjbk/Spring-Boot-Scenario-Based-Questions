package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerConfig customerConfig;
	
	public void displayCustomerInfo() {
		
		System.out.println("\nCustomer Portfolio:");
		System.out.println("Account Number\t: "+customerConfig.getAccountNo());
		System.out.println("Holder Name\t: "+customerConfig.getHolderName());
		System.out.println("Branch Name\t: "+customerConfig.getBranch());
	
		System.out.println("\nBalances\t: "+Arrays.toString(customerConfig.getBalances()));
		System.out.println("Account Types\t: "+customerConfig.getAccountTypes());
		System.out.println("Documents\t: "+customerConfig.getDocuments());
		
		System.out.println("\nInterest Rates: ");
		customerConfig.getInterestRates().forEach((x,y)->System.out.println(x+"\t = "+y));
		
		System.out.println("\nTransactions: ");
		customerConfig.getTransactions().forEach((x,y)->System.out.println(x+"\t = "+y));
	}
}
