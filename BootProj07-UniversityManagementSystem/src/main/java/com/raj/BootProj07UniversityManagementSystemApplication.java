package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.Student;

@SpringBootApplication
public class BootProj07UniversityManagementSystemApplication {

	public static void main(String[] args) {
	  
		try(ConfigurableApplicationContext ctx = 
				SpringApplication.run(BootProj07UniversityManagementSystemApplication.class, args);){
			
			Student student = ctx.getBean(Student.class);
			
			System.out.println(student);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
