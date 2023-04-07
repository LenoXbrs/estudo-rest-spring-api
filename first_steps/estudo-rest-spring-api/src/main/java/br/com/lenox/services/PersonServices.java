package br.com.lenox.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.lenox.model.Person;

@Service
public class PersonServices {
	
	private static final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		logger.info("Fiding all Persons!");
		List<Person> persons = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
		
	}
	

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
	
	public Person create(Person person){
		logger.info("Creating one person!");
		return person;
	}
	public Person update(Person person){
		logger.info("Updating one person!");
		return person;
	}
	public void delete(String id){
		logger.info("Deleting one person!");
		
	}
	
	private Person mockPerson(int i) {
		
		Person person = new Person();
		person.setFirstName("Person name" + i);
		person.setLastName("Person lastname" + i);
		person.setGender("Person gender" + i);
		person.setAddress("Person address on some place in Brazil" + i);
		person.setId(counter.getAndIncrement());
		return person;
	
	}


}
