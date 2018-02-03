package demos.java6.ws.shop.two;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "ItemQuery")
public class StockCheck {
	public StockCheck() {
		super();
    }
    public StockCheck(int noInStock, int noOnOrder) {
    	super();
        this.noInStock = noInStock;
        this.noOnOrder = noOnOrder;
    }
    @XmlAttribute(name="numberStocked")
	public int getNoInStock() {
		return noInStock;
	}
	public void setNoInStock(int noInStock) {
		this.noInStock = noInStock;
	}
	@XmlAttribute(name="numberOnOrder")
	public int getNoOnOrder() {
		return noOnOrder;
	}
	public void setNoOnOrder(int noOnOrder) {
		this.noOnOrder = noOnOrder;
	}
	private int noInStock;
    private int noOnOrder;
}
