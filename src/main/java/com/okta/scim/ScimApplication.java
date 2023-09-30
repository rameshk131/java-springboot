package com.okta.scim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScimApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScimApplication.class, args);
		System.out.println("ScimApplication started............");
	}

}
