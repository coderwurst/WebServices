package tests;

import java.util.Map;
import javax.xml.ws.BindingProvider;
import org.junit.Before;
import org.junit.Test;
import demos.ws.maths.Maths;
import demos.ws.maths.MathsService;

import static org.junit.Assert.*;

public class MathsWebServiceTest {
	@Before
	public void setUp() {
		service = new MathsService();
		proxy = service.getMathsPort();
		BindingProvider provider = (BindingProvider)proxy;
		Map <String,Object> context = provider.getRequestContext();
		context.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
	}
	@Test
	public void statefulService() {
		double value = proxy.add(10);
		assertEquals(10.0,value,0.01);
		value = proxy.multiply(12);
		assertEquals(120.0,value,0.01);
		value = proxy.divide(3);
		assertEquals(40.0,value,0.01);
		value = proxy.subtract(15);
		assertEquals(25.0,value,0.01);
	}
	private MathsService service;
	private Maths proxy;
}
