package saaj.clients;

import java.io.IOException;
import javax.xml.soap.*;

public class MathsClient {

	public static void main(String[] args) throws SOAPException, IOException {
		SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
		SOAPConnection connection = factory.createConnection();

		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage outgoingMessage = messageFactory.createMessage();

		SOAPPart soapPart = outgoingMessage.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		SOAPBody soapBody = soapEnvelope.getBody();

		SOAPElement addElement = soapBody.addChildElement(soapEnvelope.createName("add", "px", "http://one.maths.ws.java6.demos/"));
		addElement.addChildElement("arg0").addTextNode("12");
		addElement.addChildElement("arg1").addTextNode("7");
		
		outgoingMessage.saveChanges();
		
		System.out.println("About to send the following:");
		outgoingMessage.writeTo(System.out);
		
		SOAPMessage incomingMesssage = connection.call(outgoingMessage, "http://localhost:8080/Java6WS/maths1");
		
		System.out.println("\n\nJust received:");
		incomingMesssage.writeTo(System.out);
		
		connection.close();
	}

}
