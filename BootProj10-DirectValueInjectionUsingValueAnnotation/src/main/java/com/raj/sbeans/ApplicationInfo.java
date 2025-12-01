package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ApplicationInfo {

	@Value("Direct Value Injection with @Value(SPEL)")
	private String appName;
    @Value("Version-4")
	private String version;
    @Value("Rajesh")
	private String developerName;

}
