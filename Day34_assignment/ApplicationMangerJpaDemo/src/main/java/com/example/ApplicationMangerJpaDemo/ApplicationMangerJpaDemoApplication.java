package com.example.ApplicationMangerJpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ApplicationMangerJpaDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = SpringApplication.run(ApplicationMangerJpaDemoApplication.class, args);
		
		MyRepository stud;
		stud = context.getBean(MyRepository.class);
//		stud.getData();
//		System.out.println("Successfully Record Update");
//		
//		stud.getDelete();
//		System.out.println("Successfully Record Delete");
//		
		stud.getSelect();
		System.out.println("Successfully Select Query Execute");
		
	}

}
