package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class University {

	@Value("${university.name}")
	private String name;
	
	@Value("${university.location}")
	private String location;
	
	@Value("${university.rank}")
	private int rank;

	@Override
	public String toString() {
		return "University [name=" + name + ", location=" + location + ", rank=" + rank + "]";
	}

	
}
