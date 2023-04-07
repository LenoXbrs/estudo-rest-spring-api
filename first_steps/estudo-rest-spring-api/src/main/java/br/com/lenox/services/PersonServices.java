package br.com.lenox.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lenox.exceptions.ResourceNotFoundException;
import br.com.lenox.model.Person;
import br.com.lenox.repositories.PersonRepository;

@Service
public class PersonServices {
	
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository personRepository;
	
	
	public List<Person> findAll() {
		logger.info("Fiding all Persons!");
	
		
		return personRepository.findAll();
		
	}
	

	public Person findById(Long id) {
		
		logger.info("Fiding one Person!");

		
		return personRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this id " + id));
		
	}
	
	public Person create(Person person){
		logger.info("Creating one person!");
		return personRepository.save(person);
	}
	
	
	public Person update(Person person){
		logger.info("Updating one person!");
		var entity = personRepository.findById(person.getId())
			.orElseThrow(() -> new ResourceNotFoundException("No records found for this id " + person.getId()));
		entity.setAddress(person.getAddress());
		entity.setFirstName(person.getFirstName());
		entity.setGender(person.getGender());
		entity.setLastName(person.getLastName());
		return personRepository.save(entity);
	}
	public void delete(Long id){
		logger.info("Deleting one person!");
		
	var entity =personRepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("No records found for this id " + id));
	personRepository.delete(entity);
	}
	



}
