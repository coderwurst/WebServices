package pizza.shop.solution.v3;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import pizza.shop.solution.domain.decorated.CreditCard;
import pizza.shop.solution.domain.decorated.Pizza;
import pizza.shop.solution.domain.decorated.Receipt;


@WebService
public class PizzaShop {
	@WebMethod(operationName="placeOrderForPizza")
	@WebResult(name="YourOrderNumber")
	public String makeOrder(@WebParam(name="chosenPizza")Pizza pizza) {
		System.out.println("Received order for: " + pizza);
		String orderId = "ABC123";
		return orderId;
	}
	@WebMethod(operationName="purchaseYourPizza")
	@WebResult(name="YourReceipt")
	public Receipt payForOrder(@WebParam(name="TheOrderId")String orderId, 
			   				   @WebParam(name="YourCreditCard")CreditCard card) {
		return new Receipt(20.40, orderId, new Date());
	}
}
