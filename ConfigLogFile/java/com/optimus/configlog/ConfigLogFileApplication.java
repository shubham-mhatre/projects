package com.optimus.configlog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigLogFileApplication {
	
	 private static Logger logger = LoggerFactory.getLogger(ConfigLogFileApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigLogFileApplication.class, args);
		
		logger.info("Inside main :: START");
		
		String user = "shubham";
		
		logger.info("Hello Admin :: {} :: Happy Logging ",user);
		
		logger.info("Leaving main of ConfigLogFileApplication");
		
		
	}

}
