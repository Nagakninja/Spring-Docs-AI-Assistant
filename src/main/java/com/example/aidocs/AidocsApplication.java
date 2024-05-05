package com.example.aidocs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.shell.command.annotation.CommandScan;

@ImportRuntimeHints(HintsRegistrar.class)
@CommandScan
@SpringBootApplication
public class AidocsApplication {

	private static final Logger log = LoggerFactory.getLogger(AidocsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AidocsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> System.out.println("hello ");
	}

}
