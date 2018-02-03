package pizza.shop.solution;

import javax.xml.ws.Endpoint;

public class Launcher {

	public static void main(String[] args) {
		Endpoint e1 = Endpoint.create(new pizza.shop.solution.v1.PizzaShop());
		Endpoint e2 = Endpoint.create(new pizza.shop.solution.v2.PizzaShop());
		Endpoint e3 = Endpoint.create(new pizza.shop.solution.v3.PizzaShop());
		
		e1.publish("http://localhost:8181/Pizza/shop1");
		e2.publish("http://localhost:8181/Pizza/shop2");
		e3.publish("http://localhost:8181/Pizza/shop3");

		System.out.println("Pizza Shop Solutions Published...");
	}

}
