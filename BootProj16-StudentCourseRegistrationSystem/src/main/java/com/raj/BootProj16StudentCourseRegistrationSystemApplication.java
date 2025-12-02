package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.StudentService;

@SpringBootApplication
public class BootProj16StudentCourseRegistrationSystemApplication {
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj16StudentCourseRegistrationSystemApplication.class, args);){
			
			StudentService studentService = ctx.getBean(StudentService.class);
			studentService.displayStudentInfo();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
