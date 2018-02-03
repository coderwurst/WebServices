package demos.java6.ws.shop.two;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Shop {
	@WebMethod
    public boolean isInStock(Item item){
        return true;
    }
	@WebMethod
    public StockCheck quantityInStock(Item item){
        return new StockCheck(20, 10);
    }
	@WebMethod
    public double getPrice(Item item){
        return 9.50;
    }
    @WebMethod
    public boolean makePurchase(Order order){
        return true;
    }
}
