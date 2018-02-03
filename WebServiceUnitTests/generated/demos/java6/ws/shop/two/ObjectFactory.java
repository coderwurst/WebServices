
package demos.java6.ws.shop.two;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demos.java6.ws.shop.two package. 
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

    private final static QName _ItemQuery_QNAME = new QName("http://two.shop.ws.java6.demos/", "ItemQuery");
    private final static QName _MakePurchaseResponse_QNAME = new QName("http://two.shop.ws.java6.demos/", "makePurchaseResponse");
    private final static QName _IsInStockResponse_QNAME = new QName("http://two.shop.ws.java6.demos/", "isInStockResponse");
    private final static QName _GetPrice_QNAME = new QName("http://two.shop.ws.java6.demos/", "getPrice");
    private final static QName _QuantityInStockResponse_QNAME = new QName("http://two.shop.ws.java6.demos/", "quantityInStockResponse");
    private final static QName _GetPriceResponse_QNAME = new QName("http://two.shop.ws.java6.demos/", "getPriceResponse");
    private final static QName _MakePurchase_QNAME = new QName("http://two.shop.ws.java6.demos/", "makePurchase");
    private final static QName _QuantityInStock_QNAME = new QName("http://two.shop.ws.java6.demos/", "quantityInStock");
    private final static QName _IsInStock_QNAME = new QName("http://two.shop.ws.java6.demos/", "isInStock");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demos.java6.ws.shop.two
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockCheck }
     * 
     */
    public StockCheck createStockCheck() {
        return new StockCheck();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link AnItem }
     * 
     */
    public AnItem createAnItem() {
        return new AnItem();
    }

    /**
     * Create an instance of {@link IsInStockResponse }
     * 
     */
    public IsInStockResponse createIsInStockResponse() {
        return new IsInStockResponse();
    }

    /**
     * Create an instance of {@link MakePurchaseResponse }
     * 
     */
    public MakePurchaseResponse createMakePurchaseResponse() {
        return new MakePurchaseResponse();
    }

    /**
     * Create an instance of {@link AnOrder }
     * 
     */
    public AnOrder createAnOrder() {
        return new AnOrder();
    }

    /**
     * Create an instance of {@link QuantityInStock }
     * 
     */
    public QuantityInStock createQuantityInStock() {
        return new QuantityInStock();
    }

    /**
     * Create an instance of {@link IsInStock }
     * 
     */
    public IsInStock createIsInStock() {
        return new IsInStock();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link QuantityInStockResponse }
     * 
     */
    public QuantityInStockResponse createQuantityInStockResponse() {
        return new QuantityInStockResponse();
    }

    /**
     * Create an instance of {@link MakePurchase }
     * 
     */
    public MakePurchase createMakePurchase() {
        return new MakePurchase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "ItemQuery")
    public JAXBElement<StockCheck> createItemQuery(StockCheck value) {
        return new JAXBElement<StockCheck>(_ItemQuery_QNAME, StockCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "makePurchaseResponse")
    public JAXBElement<MakePurchaseResponse> createMakePurchaseResponse(MakePurchaseResponse value) {
        return new JAXBElement<MakePurchaseResponse>(_MakePurchaseResponse_QNAME, MakePurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsInStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "isInStockResponse")
    public JAXBElement<IsInStockResponse> createIsInStockResponse(IsInStockResponse value) {
        return new JAXBElement<IsInStockResponse>(_IsInStockResponse_QNAME, IsInStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityInStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "quantityInStockResponse")
    public JAXBElement<QuantityInStockResponse> createQuantityInStockResponse(QuantityInStockResponse value) {
        return new JAXBElement<QuantityInStockResponse>(_QuantityInStockResponse_QNAME, QuantityInStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "makePurchase")
    public JAXBElement<MakePurchase> createMakePurchase(MakePurchase value) {
        return new JAXBElement<MakePurchase>(_MakePurchase_QNAME, MakePurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityInStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "quantityInStock")
    public JAXBElement<QuantityInStock> createQuantityInStock(QuantityInStock value) {
        return new JAXBElement<QuantityInStock>(_QuantityInStock_QNAME, QuantityInStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsInStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://two.shop.ws.java6.demos/", name = "isInStock")
    public JAXBElement<IsInStock> createIsInStock(IsInStock value) {
        return new JAXBElement<IsInStock>(_IsInStock_QNAME, IsInStock.class, null, value);
    }

}
