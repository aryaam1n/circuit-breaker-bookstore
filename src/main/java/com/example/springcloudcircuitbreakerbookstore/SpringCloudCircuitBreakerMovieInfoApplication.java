package com.example.springcloudcircuitbreakerbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class SpringCloudCircuitBreakerMovieInfoApplication {

	@RequestMapping(value = "/movieinfo")
	public Mono<String> readingList(){
		return Mono.just("The Godfather, Star Wars, Titanic");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCircuitBreakerMovieInfoApplication.class, args);
	}

}
