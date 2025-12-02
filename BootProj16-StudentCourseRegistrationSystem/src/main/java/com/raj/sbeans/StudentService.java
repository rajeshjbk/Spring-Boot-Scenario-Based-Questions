package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentConfig config;
	
	public void displayStudentInfo() {
		
		System.out.println("Student Details: ");
		System.out.println("ID\t: "+config.getStudentId());
		System.out.println("Name\t: "+config.getStudentName());
		System.out.println("Department: "+config.getDepartment());
		
		System.out.println("Marks (Array): "+Arrays.toString(config.getMarks()));
		System.out.println("Skills\t: "+config.getSkills().toString());
		System.out.println("CGPA\t: ");
		config.getCgpa().forEach((x,y)-> System.out.println(x+" = "+y));
	}
}
