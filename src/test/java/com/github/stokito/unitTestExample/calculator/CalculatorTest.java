package com.github.stokito.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSuma() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(2, 2);
		if (result != 4) {   // si 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testResta() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.minus(2, 2)); // si 2 - 2 != 0
	}

	@Test
	public void testDividir() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	/**
	 * Division por cero
	 */
	@Test(expected = ArithmeticException.class)
	public void testDividirConThrowException() {
		Calculator calculator = new Calculator();
		int divide = calculator.divide(10, 0);
		Assert.fail("No deberia llegar a este punto");
	}

	@Test
	public void testMultiplicar() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(6, calculator.multiply(2, 3));
	}
}
