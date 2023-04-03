package br.com.lenox.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.lenox.model.Person;

@Service
public class PersonServices {
	
	private static final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {
		
		logger.info("Fiding one Person!");
		Person person = new Person();
		person.setFirstName("Luis");
		person.setLastName("Oliveira");
		person.setGender("Male");
		person.setAddress("Rua perdo do muro branco");
		person.setId(counter.getAndIncrement());
		return person;
		
	}

}
