package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import demos.java6.ws.shop.one.*;


import org.junit.Before;
import org.junit.Test;

public class ShopOneWebServiceTest {

	@Before
	public void setUp() throws Exception {
		service = new ShopService();
		proxy = service.getShopPort();
	}
	
	@Test
	public void isInStock() {
		Item item = new Item();
		item.setProductCode("TEST");
		item.setSupplierCode("TEST");
		assertTrue(proxy.isInStock(item));
	}
	
	@Test
	public void quantityInStock() {
		Item item = new Item();
		item.setProductCode("TEST");
		item.setSupplierCode("TEST");
		
		StockCheck sc = proxy.quantityInStock(item);
		assertEquals(20,sc.getNoInStock());
		assertEquals(10,sc.getNoOnOrder());
	}
	
	@Test
	public void getPrice() {
		Item item = new Item();
		item.setProductCode("TEST");
		item.setSupplierCode("TEST");
		assertEquals(9.50,proxy.getPrice(item),0.001);
	}
	
	@Test
	public void makePurchase() {
		Item item = new Item();
		item.setProductCode("TEST");
		item.setSupplierCode("TEST");
		
		Order order = new Order();
		order.setItem(item);
		order.setBuyerID("TEST");
		order.setPrice(1);
		order.setQuantity(1);
		
		assertTrue(proxy.makePurchase(order));
	}

	private ShopService service;
	private Shop proxy;
}
