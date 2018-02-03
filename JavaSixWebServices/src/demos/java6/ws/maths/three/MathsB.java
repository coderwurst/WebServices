package demos.java6.ws.maths.three;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import static javax.jws.soap.SOAPBinding.Style.*;
import static javax.jws.soap.SOAPBinding.Use.*;
import static javax.jws.soap.SOAPBinding.ParameterStyle.*;

@WebService(serviceName="MathsDocumentBare")
@SOAPBinding(style=DOCUMENT,
	         use=LITERAL,
	         parameterStyle=BARE)
public class MathsB {
	@WebMethod
	public double add(int num) {
		return num + 5;
	}
	@WebMethod
	public double subtract(int num) {
		return num - 5;
	}
	@WebMethod
	public double multiply(int num) {
		return num * 5;
	}
	@WebMethod
	public double divide(int num) {
		return num / 5.0;
	}
}
