package dynamic.ws.clients;

import java.io.StringReader;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.*;

public class MathsAsyncClientV1 {
	public static void main(String[] args) throws Exception {
		URL wsdlLocation = new URL("http://localhost:8080/Java6WS/maths1?wsdl");
		QName serviceName = new QName("http://one.maths.ws.java6.demos/","MathsService");
		QName portName = new QName("http://one.maths.ws.java6.demos/","MathsPort");
		
		Service maths1Service = Service.create(wsdlLocation,serviceName);
		Dispatch<Source> dispatch = maths1Service.createDispatch(portName, Source.class, Service.Mode.PAYLOAD);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<px:add xmlns:px=\"http://one.maths.ws.java6.demos/\">");
		buffer.append("	<arg0>12</arg0>");
		buffer.append("	<arg1>7</arg1>");
		buffer.append("</px:add>");
		
		StreamSource inputSource = new StreamSource(new StringReader(buffer.toString()));
		Response<Source> iou = dispatch.invokeAsync(inputSource);
		while(!iou.isDone()) {
			System.out.println("Main thread waiting for WS call...");
			Thread.sleep(1000);
		}
		Source outputSource = iou.get();
		String output = Utilities.convertSourceToString(outputSource);
		
		System.out.println("Call to add produced:");
        System.out.println(output);
		
	}
}
