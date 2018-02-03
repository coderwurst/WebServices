package pizza.shop.exercise;

import java.util.Date;

public class Receipt {
	public Receipt() {
		super();
	}
	public Receipt(double amount, String orderId, Date time) {
		super();
		this.amount = amount;
		this.orderId = orderId;
		this.time = time;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	private double amount;
	private String orderId;
	private Date time;
}
