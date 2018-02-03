package demos.ws.maths;

import javax.annotation.Resource;
import javax.jws.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class Maths {
	@WebMethod
	public double add(int num) {
		HttpSession session = findSession();
		double oldTotal = getOrCreateTotal(session);
		double newTotal = oldTotal + num;
		session.setAttribute("total",newTotal);
		return newTotal;
	}
	@WebMethod
	public double subtract(int num) {
		HttpSession session = findSession();
		double oldTotal = getOrCreateTotal(session);
		double newTotal = oldTotal - num;
		session.setAttribute("total",newTotal);
		return newTotal;
	}
	@WebMethod
	public double multiply(int num) {
		HttpSession session = findSession();
		double oldTotal = getOrCreateTotal(session);
		double newTotal = oldTotal * num;
		session.setAttribute("total",newTotal);
		return newTotal;
	}
	@WebMethod
	public double divide(int num) {
		HttpSession session = findSession();
		double oldTotal = getOrCreateTotal(session);
		double newTotal = oldTotal / num;
		session.setAttribute("total",newTotal);
		return newTotal;
	}
	private double getOrCreateTotal(HttpSession session) {
		Object obj = session.getAttribute("total");
		if(obj == null) {
			session.setAttribute("total",0.0);
			return 0;
		} else {
			return (Double)obj;
		}
	}
	private HttpSession findSession() {
		MessageContext mc = wsContext.getMessageContext();
		HttpServletRequest request = (HttpServletRequest)mc.get(MessageContext.SERVLET_REQUEST);
		return request.getSession();
	}
	@Resource
    private WebServiceContext wsContext;
}
