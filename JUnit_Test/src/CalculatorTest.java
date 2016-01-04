import static org.junit.Assert.*;


import junitTest.Calculator;

import org.junit.Test;


public class CalculatorTest {
	private static Calculator calculator=new Calculator();

	@Test
	public void testAdd() {
		calculator.add(1);
		//注释
		//我又加了一个注释
		//我又加了一个注释
		System.out.println(calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.substract(2);
		System.out.println(calculator.getResult());
	}

	@Test
	public void testMultiply() {
		calculator.multiply(3);
		System.out.println(calculator.getResult());
	}

	@Test
	public void testDivide() {
		calculator.divide(0);
		System.out.println(calculator.getResult());
	}

}
