package dynamic.ws.clients;

import java.io.StringWriter;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;

public class Utilities {

	static String convertSourceToString(Source source) throws TransformerFactoryConfigurationError, TransformerConfigurationException, TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
	    Transformer transformer = factory.newTransformer();
	    StringWriter sw = new StringWriter();
		StreamResult result = new StreamResult(sw);
	    transformer.transform(source, result);
		return sw.getBuffer().toString();
	}
}
