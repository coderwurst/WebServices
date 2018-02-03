package demos.java6.ws.shop.one;

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
	public String getBuyerID() {
		return buyerID;
	}
	public void setBuyerID(String buyerID) {
		this.buyerID = buyerID;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
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
