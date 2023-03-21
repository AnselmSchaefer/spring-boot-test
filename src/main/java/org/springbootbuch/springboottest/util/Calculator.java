package org.springbootbuch.springboottest.util;

import java.util.List;

public class Calculator {
	
	public double addListOfNumbers(List<? extends Number> listOfNumbers) {
		double result = 0;
		for(Number singleNumber : listOfNumbers) {
			result += singleNumber.doubleValue();
			
		}
		return result;
	}

}
