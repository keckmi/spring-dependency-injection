package com.example.springdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public interface SaySomethingService {
		public String saySomething();
	}

	@Component
	public class SayHelloService implements SaySomethingService {

		@Override
		public String saySomething() {
			return "Hello World!";
		}
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		SaySomethingService saySomethingService = applicationContext.getBean(SaySomethingService.class);
		System.out.println(saySomethingService.saySomething());
	}

}
