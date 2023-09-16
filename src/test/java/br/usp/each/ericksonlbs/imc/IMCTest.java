package br.usp.each.ericksonlbs.imc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class IMCTest {
	static int actual;
	static int expected;
	static int testCount = 1;
	Logger log = Logger.getLogger(IMCTest.class.getName());
	@AfterEach
	public void showActual(){
		log.info("Teste "+ testCount);
		System.out.println("actual: "+actual);
		System.out.println("expected: "+expected);
		testCount++;
		System.out.println("----------------------------");
	}

	@Test
	public void test1() {
		expected = 0;
		actual = IMC.Calc(55.0, 1.75);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		expected = 1;
		actual = IMC.Calc(75.0, 1.75);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		expected = 2;
		actual = IMC.Calc(90.0, 1.75);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test4() {
		expected = 3;
		actual = IMC.Calc(100.0, 1.75);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test5() {
		expected = 5;
		actual = IMC.Calc(110.0, 1.75);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test6() {
		expected = 4;
		actual = IMC.Calc(150.0, 1.75);
		Assertions.assertEquals(expected, actual);
	}
}