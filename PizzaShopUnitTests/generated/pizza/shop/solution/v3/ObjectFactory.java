
package pizza.shop.solution.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pizza.shop.solution.v3 package. 
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

    private final static QName _PlaceOrderForPizzaResponse_QNAME = new QName("http://v3.solution.shop.pizza/", "placeOrderForPizzaResponse");
    private final static QName _PurchaseYourPizza_QNAME = new QName("http://v3.solution.shop.pizza/", "purchaseYourPizza");
    private final static QName _PlaceOrderForPizza_QNAME = new QName("http://v3.solution.shop.pizza/", "placeOrderForPizza");
    private final static QName _PurchaseYourPizzaResponse_QNAME = new QName("http://v3.solution.shop.pizza/", "purchaseYourPizzaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pizza.shop.solution.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlaceOrderForPizza }
     * 
     */
    public PlaceOrderForPizza createPlaceOrderForPizza() {
        return new PlaceOrderForPizza();
    }

    /**
     * Create an instance of {@link TypeForCreditCard }
     * 
     */
    public TypeForCreditCard createTypeForCreditCard() {
        return new TypeForCreditCard();
    }

    /**
     * Create an instance of {@link PurchaseYourPizza }
     * 
     */
    public PurchaseYourPizza createPurchaseYourPizza() {
        return new PurchaseYourPizza();
    }

    /**
     * Create an instance of {@link PurchaseYourPizzaResponse }
     * 
     */
    public PurchaseYourPizzaResponse createPurchaseYourPizzaResponse() {
        return new PurchaseYourPizzaResponse();
    }

    /**
     * Create an instance of {@link TypeForReceipt }
     * 
     */
    public TypeForReceipt createTypeForReceipt() {
        return new TypeForReceipt();
    }

    /**
     * Create an instance of {@link Pizza }
     * 
     */
    public Pizza createPizza() {
        return new Pizza();
    }

    /**
     * Create an instance of {@link PlaceOrderForPizzaResponse }
     * 
     */
    public PlaceOrderForPizzaResponse createPlaceOrderForPizzaResponse() {
        return new PlaceOrderForPizzaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceOrderForPizzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v3.solution.shop.pizza/", name = "placeOrderForPizzaResponse")
    public JAXBElement<PlaceOrderForPizzaResponse> createPlaceOrderForPizzaResponse(PlaceOrderForPizzaResponse value) {
        return new JAXBElement<PlaceOrderForPizzaResponse>(_PlaceOrderForPizzaResponse_QNAME, PlaceOrderForPizzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseYourPizza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v3.solution.shop.pizza/", name = "purchaseYourPizza")
    public JAXBElement<PurchaseYourPizza> createPurchaseYourPizza(PurchaseYourPizza value) {
        return new JAXBElement<PurchaseYourPizza>(_PurchaseYourPizza_QNAME, PurchaseYourPizza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceOrderForPizza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v3.solution.shop.pizza/", name = "placeOrderForPizza")
    public JAXBElement<PlaceOrderForPizza> createPlaceOrderForPizza(PlaceOrderForPizza value) {
        return new JAXBElement<PlaceOrderForPizza>(_PlaceOrderForPizza_QNAME, PlaceOrderForPizza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseYourPizzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v3.solution.shop.pizza/", name = "purchaseYourPizzaResponse")
    public JAXBElement<PurchaseYourPizzaResponse> createPurchaseYourPizzaResponse(PurchaseYourPizzaResponse value) {
        return new JAXBElement<PurchaseYourPizzaResponse>(_PurchaseYourPizzaResponse_QNAME, PurchaseYourPizzaResponse.class, null, value);
    }

}
