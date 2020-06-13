package com.countryservice.countryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CountryclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryclientApplication.class, args);
	}

}
