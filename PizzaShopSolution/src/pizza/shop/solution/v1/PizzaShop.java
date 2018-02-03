package pizza.shop.solution.v1;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pizza.shop.solution.domain.original.CreditCard;
import pizza.shop.solution.domain.original.Pizza;
import pizza.shop.solution.domain.original.Receipt;


@WebService
public class PizzaShop {
	@WebMethod
	public String makeOrder(Pizza pizza) {
		System.out.println("Received order for: " + pizza);
		String orderId = "ABC123";
		return orderId;
	}
	@WebMethod
	public Receipt payForOrder(String orderId, CreditCard card) {
		return new Receipt(20.40, orderId, new Date());
	}
}
