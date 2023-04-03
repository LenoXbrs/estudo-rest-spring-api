package br.com.lenox;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	
	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(
			@PathVariable(value ="id")String id) {
		return personService.findById(id);
	
	}
	
	@GetMapping(
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return personService.findAll();
		
	}
	

	
	
	
	
	
	



	
	
	
	
}
