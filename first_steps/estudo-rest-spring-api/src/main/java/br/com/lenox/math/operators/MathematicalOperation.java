package br.com.lenox.math.operators;

import br.com.lenox.conversor.NumberConverter;

public class MathematicalOperation {

	
	public static Double sum(String numberOne,String numberTwo) {
			
	
		
		return NumberConverter.convertToDouble(numberOne)  +  NumberConverter.convertToDouble(numberTwo);
	}
	
	
	
	public static  Double div(String numberOne,String numberTwo) {
			
		
		
		
		return NumberConverter.convertToDouble(numberOne)  /  NumberConverter.convertToDouble(numberTwo);
	}
	
	

	public static  Double subtraction(String numberOne,String numberTwo) {
		
		
		
		
		return NumberConverter.convertToDouble(numberOne)  -  NumberConverter.convertToDouble(numberTwo);
	}
	
	
	public static  Double mean(String numberOne,String numberTwo) {
		
		return (NumberConverter.convertToDouble(numberOne)  +  NumberConverter.convertToDouble(numberTwo))/2;
	}
	
	public static  Double squareRoot(String numberOne) {
		
		return (Math.sqrt(NumberConverter.convertToDouble(numberOne)) );
	}
}
