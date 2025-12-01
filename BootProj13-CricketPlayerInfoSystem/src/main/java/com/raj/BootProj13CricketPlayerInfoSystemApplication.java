package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.raj.sbeans.PlayerService;

@SpringBootApplication
@PropertySource("com/raj/commons/player.properties")
public class BootProj13CricketPlayerInfoSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj13CricketPlayerInfoSystemApplication.class, args);){
			
			PlayerService playerService = ctx.getBean(PlayerService.class);
			playerService.displayPlayerInfo();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
