package org.springbootbuch.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springbootbuch.springboottest.util.Calculator;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
	
	@Test
	public void addListOfNumbers() {
		double expectedResult = 30;
		Calculator testCalculator = new Calculator();
		List<Integer> myTestList = Arrays.asList(10,10,10);
		assertEquals(testCalculator.addListOfNumbers(myTestList), expectedResult);
	}

}
