package tests;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pizza.shop.solution.v3.*;

public class PizzaShopThreeTest {
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
		TypeForCreditCard c = new TypeForCreditCard();
		TypeForReceipt r = proxy.purchaseYourPizza("ABC123", c);
		assertEquals(r.getCostOfOrder(),20.40,0.01);
		assertEquals(r.getIdOfOrder(),"ABC123");
	}
	private Pizza makePizza() {
		Pizza p = new Pizza();
		p.setBase(TypeForPizzaBase.CRISPY);
		p.setSize(TypeForPizzaSize.GRANDE);
		p.getToppings().add(0);
		p.getToppings().add(1);
		return p;
	}
	private PizzaShopService service;
	private PizzaShop proxy;
}
