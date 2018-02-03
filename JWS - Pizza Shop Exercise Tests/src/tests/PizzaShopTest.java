package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import pizza.shop.exercise.APizza;
import pizza.shop.exercise.OrderReceipt;
import pizza.shop.exercise.PizzaShop;
import pizza.shop.exercise.PizzaShopService;

public class PizzaShopTest {

	@Before
	public void setUp() throws Exception {
		service = new PizzaShopService();			// the class that represents the service
		proxy = service.getPizzaShopPort();			// gets port which contains access to methods
	}

	@Test
	public void testOrder() {
		String result = proxy.order(new APizza());	// port and the method name
		assertEquals("123", result);
	}
	
	@Test
	public void testPay() {
		OrderReceipt result = proxy.pay("123", "12345DE678");
		
		String orderId = result.getOrderID();

		assertEquals("123", orderId);
	}
	
	@Test
	public void testMenu() {
		String result = proxy.showMenu("Monday");
		System.out.println("result= " + result);
		assertNotNull(result);
		assertEquals("Options available include:", result.substring(0, 26));
	}

	private PizzaShopService service;
	private PizzaShop proxy;
}
