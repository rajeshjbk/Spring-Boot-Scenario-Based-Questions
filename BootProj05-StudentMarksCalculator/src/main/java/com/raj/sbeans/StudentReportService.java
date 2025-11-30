package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentReportService {

	@Autowired
	MarksService marksService;
	
	public void printReport(String name, int s1, int s2, int s3) {
		
		System.out.println("Student Name: "+name);
		int totalMarks = marksService.totalMarks(s1, s2, s3);
		System.out.println("Total marks: "+totalMarks);
		double percentage = marksService.percentage(totalMarks);
		System.out.println("Percentage: "+percentage+"%");
		String grade = marksService.grade(percentage);
		System.out.println("Grade: "+grade);
	
	}
}
