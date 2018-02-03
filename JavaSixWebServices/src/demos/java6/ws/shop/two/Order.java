package demos.java6.ws.shop.two;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AnOrder")
public class Order {
	public Order() {
		super();
    }
    public Order(Item item, String buyerID, int quantity, double price) {
    	super();
        this.item = item;
        this.buyerID = buyerID;
        this.quantity = quantity;
        this.price = price;
    }
    @XmlElement(name="IdentifierOfBuyer")
	public String getBuyerID() {
		return buyerID;
	}
	public void setBuyerID(String buyerID) {
		this.buyerID = buyerID;
	}
	@XmlElement(name="ItemBeingPurchased")
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@XmlElement(name="CostOfOrder")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@XmlElement(name="NumberRequired")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    private Item item;
    private String buyerID;
    private int quantity;
    private double price;
}
