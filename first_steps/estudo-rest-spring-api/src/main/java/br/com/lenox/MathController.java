package br.com.lenox;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.action.NewRuleAction;

@RestController
public class GreetingController {

	
	private static final String template = "Hello,%s!";
	private static final AtomicLong counter = new AtomicLong();
	
	
	
	@RequestMapping(value = "hello")
	public Greeting greeting(
			@RequestParam(value ="name",defaultValue = "word")
			String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
