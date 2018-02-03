
package pizza.shop.solution.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-02/02/2007 03:56 AM(vivekp)-FCS
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PizzaShopService", targetNamespace = "http://v1.solution.shop.pizza/", wsdlLocation = "http://localhost:8181/Pizza/shop1?wsdl")
public class PizzaShopService
    extends Service
{

    private final static URL PIZZASHOPSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8181/Pizza/shop1?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        PIZZASHOPSERVICE_WSDL_LOCATION = url;
    }

    public PizzaShopService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PizzaShopService() {
        super(PIZZASHOPSERVICE_WSDL_LOCATION, new QName("http://v1.solution.shop.pizza/", "PizzaShopService"));
    }

    /**
     * 
     * @return
     *     returns PizzaShop
     */
    @WebEndpoint(name = "PizzaShopPort")
    public PizzaShop getPizzaShopPort() {
        return (PizzaShop)super.getPort(new QName("http://v1.solution.shop.pizza/", "PizzaShopPort"), PizzaShop.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PizzaShop
     */
    @WebEndpoint(name = "PizzaShopPort")
    public PizzaShop getPizzaShopPort(WebServiceFeature... features) {
        return (PizzaShop)super.getPort(new QName("http://v1.solution.shop.pizza/", "PizzaShopPort"), PizzaShop.class, features);
    }

}
