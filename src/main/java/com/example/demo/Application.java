package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

	    PersonRepository personRepository = context.getBean(PersonRepository.class);
	    personRepository.save(new Person("Hans", "Meiser"));
	    personRepository.save(new Person("Peter", "Lustig"));
	}
}
