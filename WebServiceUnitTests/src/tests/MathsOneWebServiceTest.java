package tests;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import demos.java6.ws.maths.one.*;

public class MathsOneWebServiceTest {

	@Before
	public void setUp() throws Exception {
		service = new MathsService();
		proxy = service.getMathsPort();
	}

	@Test
	public void add() {
		double result = proxy.add(23,12);
		assertEquals(35.0,result,0.01);
	}
	
	@Test
	public void subtract() {
		double result = proxy.subtract(23,12);
		assertEquals(11.0,result,0.01);
	}
	
	@Test
	public void multiply() {
		double result = proxy.multiply(23,12);
		assertEquals(276.0,result,0.01);
	}
	
	@Test
	public void divide() {
		double result = proxy.divide(23,12);
		assertEquals(1.916,result,0.01);
	}

	private MathsService service;
	private Maths proxy;
}
