package pizza.shop.solution.domain.decorated;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TypeForReceipt")
@XmlAccessorType(XmlAccessType.PROPERTY)
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
	@XmlElement(name="CostOfOrder")
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@XmlElement(name="IdOfOrder")
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@XmlElement(name="TimeOfOrder")
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
