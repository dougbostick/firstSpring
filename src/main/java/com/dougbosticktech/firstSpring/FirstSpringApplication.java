package com.dougbosticktech.firstSpring;


import com.dougbosticktech.firstSpring.run.Run;
import com.dougbosticktech.firstSpring.run.Location;
import com.dougbosticktech.firstSpring.run.RunController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class FirstSpringApplication {

	private static final Logger log = LoggerFactory.getLogger(FirstSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
		log.info("Something changed!!");
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
