package com.balenii.QuizGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QuizGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizGameApplication.class, args);
	}

}
