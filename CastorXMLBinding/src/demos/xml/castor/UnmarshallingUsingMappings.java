package demos.xml.castor;

import java.io.File;
import java.io.FileReader;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.XMLContext;

public class UnmarshallingUsingMappings {
	public static void main(String[] args) throws Exception {
		Mapping mapping = new Mapping();
		mapping.loadMapping("mappings" + File.separator + "map1.xml");
		
		XMLContext context = new XMLContext();
		context.addMapping(mapping);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(Employee.class);

		FileReader reader = new FileReader("input" + File.separator + "emp1.xml");
		Employee emp = (Employee)unmarshaller.unmarshal(reader);
		
		System.out.print("Details of unmarshalled employee are:\n\t");
		System.out.println(emp.toString());
	}

}
