package demos.java6.ws.maths.one;

import javax.jws.*;

@WebService
public class Maths {
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
