package demos.java6.ws.maths.three;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import static javax.jws.soap.SOAPBinding.Style.*;
import static javax.jws.soap.SOAPBinding.Use.*;
import static javax.jws.soap.SOAPBinding.ParameterStyle.*;

@WebService(serviceName="MathsDocumentWrapped")
@SOAPBinding(style=DOCUMENT,
		     use=LITERAL,
		     parameterStyle=WRAPPED)
public class MathsA {
	@WebMethod
	public double add(int no1, int no2) {
		return no1 + no2;
	}
	@WebMethod
	public double subtract(int no1, int no2) {
		return no1 - no2;
	}
	@WebMethod
	public double multiply(int no1, int no2) {
		return no1 * no2;
	}
	@WebMethod
	public double divide(int no1, int no2) {
		return no1 / (double)no2;
	}
}
