package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.InfoService;

@SpringBootApplication
public class BootProj10DirectValueInjectionUsingValueAnnotationWithSpelApplication {

	public static void main(String[] args) {
	   
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj10DirectValueInjectionUsingValueAnnotationWithSpelApplication.class, args);){
			
			InfoService infoService = ctx.getBean(InfoService.class);
			infoService.displayInfo();
		}
	}

}
