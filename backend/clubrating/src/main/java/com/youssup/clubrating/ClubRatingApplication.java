package com.youssup.clubrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ClubRatingApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.directory(System.getProperty("user.dir"))
				.load();

		System.setProperty("MONGO_URI", dotenv.get("MONGO_URI"));
		SpringApplication.run(ClubRatingApplication.class, args);
	}

	@Bean
	public Dotenv dotenv() {
		return Dotenv.load();
	}
}
