package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class BasicSpringWithJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringWithJspApplication.class, args);
	}

}
