package demos.java6.ws.maths.two;

import javax.jws.*;

@WebService(name="Mathematics",serviceName="MathematicsWebService")
public class Maths {
	@WebMethod(operationName="addition")
	@WebResult(name="AddRetVal")
	public double add(@WebParam(name="numberOne")int no1, 
					  @WebParam(name="numberTwo")int no2) {
		return no1 + no2;
	}
	@WebMethod(operationName="subtraction")
	@WebResult(name="SubtractRetVal")
	public double subtract(@WebParam(name="numberOne")int no1, 
					       @WebParam(name="numberTwo")int no2) {
		return no1 - no2;
	}
	@WebMethod(operationName="multiplication")
	@WebResult(name="MultiplyRetVal")
	public double multiply(@WebParam(name="numberOne")int no1, 
					       @WebParam(name="numberTwo")int no2) {
		return no1 * no2;
	}
	@WebMethod(operationName="division")
	@WebResult(name="DivideRetVal")
	public double divide(@WebParam(name="numberOne")int no1, 
					     @WebParam(name="numberTwo")int no2) {
		return no1 / (double)no2;
	}
}
