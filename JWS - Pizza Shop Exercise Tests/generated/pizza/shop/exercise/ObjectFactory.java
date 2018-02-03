
package pizza.shop.exercise;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pizza.shop.exercise package. 
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

    private final static QName _ShowMenuResponse_QNAME = new QName("http://exercise.shop.pizza/", "showMenuResponse");
    private final static QName _PayResponse_QNAME = new QName("http://exercise.shop.pizza/", "payResponse");
    private final static QName _ShowMenu_QNAME = new QName("http://exercise.shop.pizza/", "showMenu");
    private final static QName _Pay_QNAME = new QName("http://exercise.shop.pizza/", "pay");
    private final static QName _OrderResponse_QNAME = new QName("http://exercise.shop.pizza/", "orderResponse");
    private final static QName _Order_QNAME = new QName("http://exercise.shop.pizza/", "order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pizza.shop.exercise
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowMenuResponse }
     * 
     */
    public ShowMenuResponse createShowMenuResponse() {
        return new ShowMenuResponse();
    }

    /**
     * Create an instance of {@link Pay }
     * 
     */
    public Pay createPay() {
        return new Pay();
    }

    /**
     * Create an instance of {@link APizza }
     * 
     */
    public APizza createAPizza() {
        return new APizza();
    }

    /**
     * Create an instance of {@link PayResponse }
     * 
     */
    public PayResponse createPayResponse() {
        return new PayResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link ShowMenu }
     * 
     */
    public ShowMenu createShowMenu() {
        return new ShowMenu();
    }

    /**
     * Create an instance of {@link OrderReceipt }
     * 
     */
    public OrderReceipt createOrderReceipt() {
        return new OrderReceipt();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowMenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exercise.shop.pizza/", name = "showMenuResponse")
    public JAXBElement<ShowMenuResponse> createShowMenuResponse(ShowMenuResponse value) {
        return new JAXBElement<ShowMenuResponse>(_ShowMenuResponse_QNAME, ShowMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exercise.shop.pizza/", name = "payResponse")
    public JAXBElement<PayResponse> createPayResponse(PayResponse value) {
        return new JAXBElement<PayResponse>(_PayResponse_QNAME, PayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowMenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exercise.shop.pizza/", name = "showMenu")
    public JAXBElement<ShowMenu> createShowMenu(ShowMenu value) {
        return new JAXBElement<ShowMenu>(_ShowMenu_QNAME, ShowMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exercise.shop.pizza/", name = "pay")
    public JAXBElement<Pay> createPay(Pay value) {
        return new JAXBElement<Pay>(_Pay_QNAME, Pay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exercise.shop.pizza/", name = "orderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exercise.shop.pizza/", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

}
