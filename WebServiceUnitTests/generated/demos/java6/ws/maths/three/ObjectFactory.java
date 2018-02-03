
package demos.java6.ws.maths.three;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demos.java6.ws.maths.three package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://three.maths.ws.java6.demos/", "add");
    private final static QName _DivideResponse_QNAME = new QName("http://three.maths.ws.java6.demos/", "divideResponse");
    private final static QName _SubtractResponse_QNAME = new QName("http://three.maths.ws.java6.demos/", "subtractResponse");
    private final static QName _Divide_QNAME = new QName("http://three.maths.ws.java6.demos/", "divide");
    private final static QName _Multiply_QNAME = new QName("http://three.maths.ws.java6.demos/", "multiply");
    private final static QName _MultiplyResponse_QNAME = new QName("http://three.maths.ws.java6.demos/", "multiplyResponse");
    private final static QName _Subtract_QNAME = new QName("http://three.maths.ws.java6.demos/", "subtract");
    private final static QName _AddResponse_QNAME = new QName("http://three.maths.ws.java6.demos/", "addResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demos.java6.ws.maths.three
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "add")
    public JAXBElement<Integer> createAdd(Integer value) {
        return new JAXBElement<Integer>(_Add_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "divideResponse")
    public JAXBElement<Double> createDivideResponse(Double value) {
        return new JAXBElement<Double>(_DivideResponse_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "subtractResponse")
    public JAXBElement<Double> createSubtractResponse(Double value) {
        return new JAXBElement<Double>(_SubtractResponse_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "divide")
    public JAXBElement<Integer> createDivide(Integer value) {
        return new JAXBElement<Integer>(_Divide_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "multiply")
    public JAXBElement<Integer> createMultiply(Integer value) {
        return new JAXBElement<Integer>(_Multiply_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "multiplyResponse")
    public JAXBElement<Double> createMultiplyResponse(Double value) {
        return new JAXBElement<Double>(_MultiplyResponse_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "subtract")
    public JAXBElement<Integer> createSubtract(Integer value) {
        return new JAXBElement<Integer>(_Subtract_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://three.maths.ws.java6.demos/", name = "addResponse")
    public JAXBElement<Double> createAddResponse(Double value) {
        return new JAXBElement<Double>(_AddResponse_QNAME, Double.class, null, value);
    }

}
