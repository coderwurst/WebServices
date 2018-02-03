package demos.xml.castor;

import java.io.File;
import java.io.FileWriter;

import org.exolab.castor.xml.Marshaller;

public class IntrospectionModeDemo {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Joe Bloggs",27,30000.0);
		FileWriter fw = new FileWriter("output" + File.separator + "out1.xml");
		Marshaller.marshal(emp,fw);
		System.out.println("Just marshalled an Employee via reflection...");
	}
}
