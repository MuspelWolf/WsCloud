package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.modelo.Libro;


@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringBootCloudApplication {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(SpringBootCloudApplication.class, args);
		
		Libro libro = context.getBean("libro", Libro.class);
		System.out.println(libro);
	}

}
