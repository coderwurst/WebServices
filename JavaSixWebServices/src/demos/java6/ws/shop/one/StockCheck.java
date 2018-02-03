package demos.java6.ws.shop.one;

public class StockCheck {
	public StockCheck() {
		super();
    }
    public StockCheck(int noInStock, int noOnOrder) {
    	super();
        this.noInStock = noInStock;
        this.noOnOrder = noOnOrder;
    }
	public int getNoInStock() {
		return noInStock;
	}
	public void setNoInStock(int noInStock) {
		this.noInStock = noInStock;
	}
	public int getNoOnOrder() {
		return noOnOrder;
	}
	public void setNoOnOrder(int noOnOrder) {
		this.noOnOrder = noOnOrder;
	}
	private int noInStock;
    private int noOnOrder;
}
