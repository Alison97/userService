package com.microUsersApp.microUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MicroUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUsersApplication.class, args);
	}

}
