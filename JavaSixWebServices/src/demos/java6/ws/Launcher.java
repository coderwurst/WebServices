package demos.java6.ws;

import javax.xml.ws.Endpoint;

public class Launcher {
	public static void main(String[] args) {
		Endpoint e1 = Endpoint.create(new demos.java6.ws.maths.one.Maths());
		Endpoint e2 = Endpoint.create(new demos.java6.ws.maths.two.Maths());
		Endpoint e3 = Endpoint.create(new demos.java6.ws.maths.three.MathsA());
		Endpoint e4 = Endpoint.create(new demos.java6.ws.maths.three.MathsB());
		Endpoint e5 = Endpoint.create(new demos.java6.ws.maths.three.MathsC());
		Endpoint e6 = Endpoint.create(new demos.java6.ws.shop.one.Shop());
		Endpoint e7 = Endpoint.create(new demos.java6.ws.shop.two.Shop());
		
		e1.publish("http://localhost:8080/Java6WS/maths1");
		e2.publish("http://localhost:8080/Java6WS/maths2");
		e3.publish("http://localhost:8080/Java6WS/maths3a");
		e4.publish("http://localhost:8080/Java6WS/maths3b");
		e5.publish("http://localhost:8080/Java6WS/maths3c");
		e6.publish("http://localhost:8080/Java6WS/shop1");
		e7.publish("http://localhost:8080/Java6WS/shop2");
		
		System.out.println("All Web Services Published...");
	}
}
