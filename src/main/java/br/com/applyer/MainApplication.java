package br.com.applyer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
public class MainApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
