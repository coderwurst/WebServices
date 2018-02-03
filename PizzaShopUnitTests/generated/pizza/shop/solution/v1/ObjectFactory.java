
package pizza.shop.solution.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pizza.shop.solution.v1 package. 
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

    private final static QName _MakeOrderResponse_QNAME = new QName("http://v1.solution.shop.pizza/", "makeOrderResponse");
    private final static QName _PayForOrderResponse_QNAME = new QName("http://v1.solution.shop.pizza/", "payForOrderResponse");
    private final static QName _PayForOrder_QNAME = new QName("http://v1.solution.shop.pizza/", "payForOrder");
    private final static QName _MakeOrder_QNAME = new QName("http://v1.solution.shop.pizza/", "makeOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pizza.shop.solution.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link MakeOrderResponse }
     * 
     */
    public MakeOrderResponse createMakeOrderResponse() {
        return new MakeOrderResponse();
    }

    /**
     * Create an instance of {@link PayForOrderResponse }
     * 
     */
    public PayForOrderResponse createPayForOrderResponse() {
        return new PayForOrderResponse();
    }

    /**
     * Create an instance of {@link Pizza }
     * 
     */
    public Pizza createPizza() {
        return new Pizza();
    }

    /**
     * Create an instance of {@link PayForOrder }
     * 
     */
    public PayForOrder createPayForOrder() {
        return new PayForOrder();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link MakeOrder }
     * 
     */
    public MakeOrder createMakeOrder() {
        return new MakeOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.solution.shop.pizza/", name = "makeOrderResponse")
    public JAXBElement<MakeOrderResponse> createMakeOrderResponse(MakeOrderResponse value) {
        return new JAXBElement<MakeOrderResponse>(_MakeOrderResponse_QNAME, MakeOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.solution.shop.pizza/", name = "payForOrderResponse")
    public JAXBElement<PayForOrderResponse> createPayForOrderResponse(PayForOrderResponse value) {
        return new JAXBElement<PayForOrderResponse>(_PayForOrderResponse_QNAME, PayForOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.solution.shop.pizza/", name = "payForOrder")
    public JAXBElement<PayForOrder> createPayForOrder(PayForOrder value) {
        return new JAXBElement<PayForOrder>(_PayForOrder_QNAME, PayForOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.solution.shop.pizza/", name = "makeOrder")
    public JAXBElement<MakeOrder> createMakeOrder(MakeOrder value) {
        return new JAXBElement<MakeOrder>(_MakeOrder_QNAME, MakeOrder.class, null, value);
    }

}
