package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.age}")
	private int age;
	
	@Value("${student.major}")
	private String major;
	
	@Value("${student.year}")
	private String year;

	@Autowired
	private University university;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + ", year=" + year + ", university="
				+ university + "]";
	}
}
