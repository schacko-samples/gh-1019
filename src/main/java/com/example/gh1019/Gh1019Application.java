package com.example.gh1019;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Gh1019Application {

	public static void main(String[] args) {
		SpringApplication.run(Gh1019Application.class, args);
	}

	@Bean
	public Consumer<String> hello1() {
		return s -> {
			try {
				Thread.sleep(5_000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("From incoming1: " + s);
		};
	}

	@Bean
	public Consumer<String> hello2() {
		return s -> {
			try {
				Thread.sleep(5_000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("From incoming2: " + s);
		};
	}

	@Bean
	public Consumer<String> hello3() {
		return s -> System.out.println("From incoming3: " + s);
	}

	@Bean
	public Consumer<String> hello4() {
		return s -> System.out.println("From incoming4: " + s);
	}

	@Bean
	public Consumer<String> hello5() {
		return s -> System.out.println("From incoming5: " + s);
	}

}
