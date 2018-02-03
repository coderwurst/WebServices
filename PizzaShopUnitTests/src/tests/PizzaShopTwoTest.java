package tests;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pizza.shop.solution.v2.*;

public class PizzaShopTwoTest {
	@Before
	public void setUp() throws Exception {
		service = new PizzaShopService();
		proxy = service.getPizzaShopPort();
	}
	@Test
	public void testOrdering() throws Exception {
		Pizza p = makePizza();
		String id = proxy.placeOrderForPizza(p);
		assertEquals("ABC123",id);
	}
	@Test
	public void testPayment() throws Exception {
		CreditCard c = new CreditCard();
		Receipt r = proxy.purchaseYourPizza("ABC123", c);
		assertEquals(r.getAmount(),20.40,0.01);
		assertEquals(r.getOrderId(),"ABC123");
	}
	private Pizza makePizza() {
		Pizza p = new Pizza();
		p.setBase(PizzaBase.THICK);
		p.setSize(PizzaSize.LARGE);
		p.getToppings().add(PizzaToppings.CHICKEN);
		p.getToppings().add(PizzaToppings.MUSHROOM);
		return p;
	}
	private PizzaShopService service;
	private PizzaShop proxy;
}
