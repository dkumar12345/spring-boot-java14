package com.dkumar.springbootjava14;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJava14Application implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(SpringBootJava14Application.class);

	@Value("${server.port}")
	private int serverPort;

	
	  @Value("${app.description}") private String description;
	 
	public static void main(String[] args) {

		// System.exit(SpringApplication.exit(SpringApplication.run(SpringBootJava14Application.class,
		// args)));

		SpringApplication.run(SpringBootJava14Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("####################################################");
		logger.info("    " + description);
		String ip = InetAddress.getLocalHost().getHostAddress();
		logger.info("     !Local ip Address :- " + ip);

		logger.info("     !Your server is up and running at port: " + serverPort);
		
		logger.info("Hi welcome to password anything is computing reaming to the ");
		
		
	}


}





