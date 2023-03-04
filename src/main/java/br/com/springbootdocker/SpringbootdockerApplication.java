package br.com.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerApplication.class, args);
		
		@GetMapping("/hello world")
		private String getHelloWorld(){
			return "Hello World springboot-docker";
		}
	}

}
