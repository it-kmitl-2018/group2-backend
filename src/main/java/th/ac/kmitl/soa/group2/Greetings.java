package th.ac.kmitl.soa.group2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Greetings {

	public static void main(String[] args) {
		SpringApplication.run(Greetings.class, args);
		System.out.println("Hello, World");
	}

}
