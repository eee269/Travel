package com.travel.go;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "local");
		SpringApplication.run(TravelApplication.class, args);
	}

}
