package br.com.lenox;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.lenox.model.Person;
import br.com.lenox.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	

	@Autowired
	private PersonServices personService;
	
	private static final AtomicLong counter = new AtomicLong();
	
	
	
	@GetMapping(
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return personService.findAll();
		
	}
	
	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(
			@PathVariable(value ="id")String id) {
		return personService.findById(id);
	
	}
	@PostMapping(
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person) {
		return personService.create(person);
		
	}
	@PutMapping(
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person) {
		return personService.update(person);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(
			@PathVariable(value ="id")String id) {
		 	personService.delete(id);
	
	}
	

	

	
	
	
	
	
	



	
	
	
	
}
