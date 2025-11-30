package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.StudentReportService;

@SpringBootApplication
public class BootProj05StudentMarksCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj05StudentMarksCalculatorApplication.class, args);){
			
			StudentReportService studentReportService = ctx.getBean(StudentReportService.class);
			studentReportService.printReport("Rajesh", 94, 89, 90);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
