package br.com.lenox;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.lenox.conversor.NumberConverter;
import br.com.lenox.exceptions.UnsupportedMathOperationException;
import br.com.lenox.math.operators.MathematicalOperation;

@RestController
public class MathController {
	

	
	
	private static final AtomicLong counter = new AtomicLong();
	
	
	
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(value ="numberOne")String numberOne,
			@PathVariable(value ="numberTwo")String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a number");
		}
		
		return MathematicalOperation.sum(numberOne, numberTwo);
	
	}
	
	
	@GetMapping(value = "/div/{numberOne}/{numberTwo}")
	public Double div(
			@PathVariable(value ="numberOne")String numberOne,
			@PathVariable(value ="numberTwo")String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a number");
		}
		return MathematicalOperation.div(numberOne, numberTwo);
	}
	
	
	@GetMapping(value = "/sub/{numberOne}/{numberTwo}")
	public Double subtraction(
			@PathVariable(value ="numberOne")String numberOne,
			@PathVariable(value ="numberTwo")String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a number");
		}
		return MathematicalOperation.subtraction(numberOne, numberTwo);
	}
	
	
	@GetMapping(value = "/mean/{numberOne}/{numberTwo}")
	public Double mean(
			@PathVariable(value ="numberOne")String numberOne,
			@PathVariable(value ="numberTwo")String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a number");
		}
		return MathematicalOperation.mean(numberOne, numberTwo);
	}
	
	
	@GetMapping(value = "/squareRoot/{numberOne}")
	public Double squareRoot(
			@PathVariable(value ="numberOne")String numberOne
		
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a number");
		}
		return MathematicalOperation.squareRoot(numberOne);
	}
	
	
	
	
	



	
	
	
	
}
