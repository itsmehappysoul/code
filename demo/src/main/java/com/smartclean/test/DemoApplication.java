package com.smartclean.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		try {
			 @SuppressWarnings("unused")
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root);
			 System.out.println("Connected With the database successfully");
			 
			 } catch (SQLException e) {
				 e.printStackTrace();
			 System.out.println("Error while connecting to the database");
			 
			 }
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
