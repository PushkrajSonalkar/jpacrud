package com.jpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableAutoConfiguration
@EnableJpaAuditing
public class BootApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(BootApplication.class, args);
	}
}
