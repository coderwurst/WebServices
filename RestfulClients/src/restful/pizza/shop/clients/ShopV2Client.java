package restful.pizza.shop.clients;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.*;
import org.apache.http.util.*;

public class ShopV2Client {
   private static final String CONTEXT_URL="/restfulws/resources/pizzaShopV2";
	
   public static void main(String[] args) throws Exception {
        setCommonsLoggingProperties();

        HttpClient client = new DefaultHttpClient();
        HttpHost host = new HttpHost("localhost",8080);

        //Sanity check
        HttpGet getRequest = new HttpGet(CONTEXT_URL);
        HttpResponse response = client.execute(host, getRequest);
        checkResponse(response,"Cant do sanity check!");
        System.out.println(EntityUtils.toString(response.getEntity()));

        //Create an account
        HttpPut putRequest = new HttpPut(CONTEXT_URL + "/clients/AB12");
        response = client.execute(host, putRequest);
        checkResponse(response,"Cant create account!");

        //Order A Pizza
        HttpPost postRequest = new HttpPost(CONTEXT_URL + "/AB12/order");
        String  pizza = "<Pizza><Base>THIN</Base><Size>MEDIUM</Size><Toppings>ONION</Toppings><Toppings>MUSHROOM</Toppings></Pizza>";
        postRequest.setEntity(new StringEntity(pizza));
        postRequest.setHeader("Content-Type", "application/xml");
        response = client.execute(host, postRequest);
        checkResponse(response,"Cant order a pizzza!");

        //List the order as HTML
        HttpGet getRequestTwo = new HttpGet(CONTEXT_URL + "/AB12/order.html");
        response = client.execute(host, getRequestTwo);
        checkResponse(response,"Cant get list of pizzas!");
        System.out.println(EntityUtils.toString(response.getEntity()));

        //List the order as XML
        HttpGet getRequestThree = new HttpGet(CONTEXT_URL + "/AB12/order.xml");
        response = client.execute(host, getRequestThree);
        checkResponse(response,"Cant get list of pizzas!");
        System.out.println(EntityUtils.toString(response.getEntity()));

        //Delete the order
        HttpDelete deleteRequest = new HttpDelete(CONTEXT_URL + "/clients/AB12");
        response = client.execute(host, deleteRequest);
        checkResponse(response,"Cant delete account!");
    }
    private static void checkResponse(HttpResponse response, String msg) {
        int code = response.getStatusLine().getStatusCode();
        if (code < 200 || code > 299) {
            System.out.printf("%s - code %d\n",msg,code);
            System.exit(1);
        }
    }
    private static void setCommonsLoggingProperties() {
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire.header", "debug");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "debug");
    }
}
