package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import demos.java6.ws.maths.three.*;

public class MathsThreeWebServiceTest {
	@Before
	public void setUp() throws Exception {
		service1 = new MathsDocumentWrapped();
		service2 = new MathsDocumentBare();
		service3 = new MathsRPC();
		proxy1 = service1.getMathsAPort();
		proxy2 = service2.getMathsBPort();
		proxy3 = service3.getMathsCPort();
	}

	@Test
	public void add() {
		assertEquals(35.0,proxy1.add(23,12),0.01);
		assertEquals(28.0,proxy2.add(23),0.01);
		assertEquals(35.0,proxy3.add(23,12),0.01);
	}
	
	@Test
	public void subtract() {
		assertEquals(11.0,proxy1.subtract(23,12),0.01);
		assertEquals(18.0,proxy2.subtract(23),0.01);
		assertEquals(11.0,proxy3.subtract(23,12),0.01);
	}
	
	@Test
	public void multiply() {
		assertEquals(276.0,proxy1.multiply(23,12),0.01);
		assertEquals(115.0,proxy2.multiply(23),0.01);
		assertEquals(276.0,proxy3.multiply(23,12),0.01);
	}
	
	@Test
	public void divide() {
		assertEquals(1.916,proxy1.divide(23,12),0.01);
		assertEquals(4.600,proxy2.divide(23),0.01);
		assertEquals(1.916,proxy3.divide(23,12),0.01);
	}

	private MathsDocumentWrapped service1;
	private MathsDocumentBare service2;
	private MathsRPC service3;
	private MathsA proxy1;
	private MathsB proxy2;
	private MathsC proxy3;
}
