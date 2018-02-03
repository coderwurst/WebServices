package demos.xml.castor;

import java.io.File;
import java.io.FileWriter;

import org.exolab.castor.mapping.*;
import org.exolab.castor.xml.*;

public class MarshallingUsingMappings {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Joe Bloggs",27,30000.0);
		FileWriter fw = new FileWriter("output" + File.separator + "out2.xml");
		
		Mapping mapping = new Mapping();
		mapping.loadMapping("mappings" + File.separator + "map1.xml");
		
		XMLContext context = new XMLContext();
		context.addMapping(mapping);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(fw);
		
		marshaller.marshal(emp);
		System.out.println("Just marshalled an Employee via a mapping file...");
	}

}
