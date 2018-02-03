package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import demos.java6.ws.maths.two.*;

public class MathsTwoWebServiceTest {
	@Before
	public void setUp() throws Exception {
		service = new MathematicsWebService();
		proxy = service.getMathematicsPort();
	}

	@Test
	public void add() {
		double result = proxy.addition(23,12);
		assertEquals(35.0,result,0.01);
	}
	
	@Test
	public void subtract() {
		double result = proxy.subtraction(23,12);
		assertEquals(11.0,result,0.01);
	}
	
	@Test
	public void multiply() {
		double result = proxy.multiplication(23,12);
		assertEquals(276.0,result,0.01);
	}
	
	@Test
	public void divide() {
		double result = proxy.division(23,12);
		assertEquals(1.916,result,0.01);
	}

	private MathematicsWebService service;
	private Mathematics proxy;
}
