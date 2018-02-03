package demos.jaxb.marshall;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();
		demo6();
		demo7();
		System.out.println("All demos run...");
	}

	private static void demo1() throws Exception {
		emp.one.Employee employee = new emp.one.Employee();
		employee.setName("Joe Bloggs");
		employee.setAge(BigInteger.valueOf(35));
		employee.setSalary(40000.0);
		saveEmployeeAsXml(employee);
	}
	private static void demo2() throws Exception {
		emp.two.Employee employee = new emp.two.Employee();
		emp.two.Name name = new emp.two.Name();
		name.setValue("Joe Bloggs");
		name.setTitle("Mr");
		employee.setName(name);
		employee.setAge(BigInteger.valueOf(35));
		employee.setSalary(40000.0);
		saveEmployeeAsXml(employee);
	}
	private static void demo3() throws Exception {
		emp.three.Employee employee = new emp.three.Employee();
		emp.three.Name name = new emp.three.Name();
		name.setValue("Joe Bloggs");
		name.setTitle("Mr");
		employee.setName(name);
		employee.setAge(BigInteger.valueOf(35));
		employee.setSalary(40000.0);
		saveEmployeeAsXml(employee);
	}
	private static void demo4() throws Exception {
		emp.four.Employee employee = new emp.four.Employee();
		emp.four.Name name = new emp.four.Name();
		emp.four.TitleType title = emp.four.TitleType.MR;
		name.setValue("Joe Bloggs");
		name.setTitle(title);
		employee.setName(name);
		employee.setAge(BigInteger.valueOf(35));
		employee.setSalary(40000.0);
		saveEmployeeAsXml(employee);
	}
	private static void demo5() throws Exception {
		emp.five.Employee employee = new emp.five.Employee();
		emp.five.Name name = new emp.five.Name();
		emp.five.TitleType title = emp.five.TitleType.MR;
		name.setValue("Joe Bloggs");
		name.setTitle(title);
		employee.setName(name);
		employee.setAge(35);
		employee.setSalary(40000.0);
		saveEmployeeAsXml(employee);
	}
	private static void demo6() throws Exception {
		emp.six.Employee employee = new emp.six.Employee();
		emp.six.Name name = new emp.six.Name();
		emp.six.TitleType title = emp.six.TitleType.MR;
		name.setValue("Joe Bloggs");
		name.setTitle(title);
		employee.setName(name);
		employee.setAge(35);
		employee.setSalary(40000.0);
		
		emp.six.Employee.PhoneNumberList phoneNos = new emp.six.Employee.PhoneNumberList();
		List<emp.six.Employee.PhoneNumberList.PhoneNumber> numbers = phoneNos.getPhoneNumber();
		numbers.add(buildPhoneNo("home","028","90 1234"));
		numbers.add(buildPhoneNo("mobile","0779","73 5678"));
		employee.setPhoneNumberList(phoneNos);
		saveEmployeeAsXml(employee);
	}
	private static void demo7() throws Exception {
		emp.seven.Employee employee = new emp.seven.Employee();
		emp.seven.Name name = new emp.seven.Name();
		emp.seven.TitleType title = emp.seven.TitleType.MR;
		name.setValue("Joe Bloggs");
		name.setTitle(title);
		employee.setName(name);
		employee.setAge(35);
		employee.setSalary(40000.0);
		
		emp.seven.PhoneNumberList phoneNos = new emp.seven.PhoneNumberList();
		List<emp.seven.PhoneNumber> numbers = phoneNos.getPhoneNumber();
		numbers.add(buildPhoneNo(emp.seven.PhoneNumberKind.HOME,"028","90 1234"));
		numbers.add(buildPhoneNo(emp.seven.PhoneNumberKind.MOBILE,"0779","73 5678"));
		employee.setPhoneNumberList(phoneNos);
		saveEmployeeAsXml(employee);
	}
	private static emp.six.Employee.PhoneNumberList.PhoneNumber buildPhoneNo(String kind, String prefix, String number) {
		emp.six.Employee.PhoneNumberList.PhoneNumber tmp = new emp.six.Employee.PhoneNumberList.PhoneNumber();
		tmp.setKind(kind);
		tmp.setPrefix(prefix);
		tmp.setValue(number);
		return tmp;
	}
	private static emp.seven.PhoneNumber buildPhoneNo(emp.seven.PhoneNumberKind kind, String prefix, String number) {
		emp.seven.PhoneNumber tmp = new emp.seven.PhoneNumber();
		tmp.setKind(kind);
		tmp.setPrefix(prefix);
		tmp.setValue(number);
		return tmp;
	}
	private static void saveEmployeeAsXml(Object obj) throws Exception {
		JAXBContext context = JAXBContext.newInstance(obj.getClass()); 
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		FileOutputStream output = new FileOutputStream(buildFileName(obj));
		marshaller.marshal(obj,output);
		System.out.println("Just marshalled instance of: " + obj.getClass().getName());
	}
	private static String buildFileName(Object obj) {
		StringBuilder builder = new StringBuilder("output");
		builder.append(File.separator);
		builder.append(obj.getClass().getName());
		builder.append(".xml");
		return builder.toString();
	}
}
