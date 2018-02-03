package demos.jaxb.unmarshall;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import demos.jaxb.unmarshall.Order.Priority;

public class Demo {

	public static void main(String[] args) throws Exception {
		saveOrder();
		System.out.println(loadOrder());
	}
	private static Order loadOrder() throws Exception {
		FileInputStream input = new FileInputStream("input" + File.separator + "order.xml");
		JAXBContext context = JAXBContext.newInstance(Order.class); 
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (Order)unmarshaller.unmarshal(input);
	}
	private static void saveOrder() throws Exception {
		Order order = buildAnOrder();
		JAXBContext context = JAXBContext.newInstance(Order.class); 
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		FileOutputStream output = new FileOutputStream("output" + File.separator + "order.xml");
		marshaller.marshal(order,output);
	}
	private static Order buildAnOrder() {
		Order tmp = new Order("XYZ123",Priority.URGENT);
		tmp.add(new Item("AB12",12,3.4));
		tmp.add(new Item("CD34",34,5.6));
		tmp.add(new Item("EF56",56,7.8));
		return tmp;
	}

}
