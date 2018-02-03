package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import demos.java6.ws.shop.two.*;

import org.junit.Before;
import org.junit.Test;

public class ShopTwoWebServiceTest {
	@Before
	public void setUp() throws Exception {
		service = new ShopService();
		proxy = service.getShopPort();
	}
	
	@Test
	public void isInStock() {
		AnItem item = new AnItem();
		item.setProductCatalogCode("TEST");
		item.setSupplierReferenceNum("TEST");
		assertTrue(proxy.isInStock(item));
	}
	
	@Test
	public void quantityInStock() {
		AnItem item = new AnItem();
		item.setProductCatalogCode("TEST");
		item.setSupplierReferenceNum("TEST");
		
		StockCheck sc = proxy.quantityInStock(item);
		assertEquals(20,sc.getNumberStocked());
		assertEquals(10,sc.getNumberOnOrder());
	}
	
	@Test
	public void getPrice() {
		AnItem item = new AnItem();
		item.setProductCatalogCode("TEST");
		item.setSupplierReferenceNum("TEST");
		assertEquals(9.50,proxy.getPrice(item),0.001);
	}
	
	@Test
	public void makePurchase() {
		AnItem item = new AnItem();
		item.setProductCatalogCode("TEST");
		item.setSupplierReferenceNum("TEST");
		
		AnOrder order = new AnOrder();
		order.setItemBeingPurchased(item);
		order.setIdentifierOfBuyer("TEST");
		order.setCostOfOrder(1);
		order.setNumberRequired(1);
		
		assertTrue(proxy.makePurchase(order));
	}

	private ShopService service;
	private Shop proxy;
}
