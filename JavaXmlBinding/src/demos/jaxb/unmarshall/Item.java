package demos.jaxb.unmarshall;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AnItem")
public class Item {
	public Item() {
		super();
	}
	public Item(String productCode, int quantity, double price) {
		super();
		this.productCode = productCode;
		this.quantity = quantity;
		this.price = price;
	}
	@XmlElement(name = "ProductCatalogCode")
	public String getProductCode() {
		return productCode;
	}
	@XmlElement(name = "CostOfItem")
	public double getPrice() {
		return price;
	}
	@XmlElement(name = "NumberRequired")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	@Override
	public String toString() {
		return String.valueOf(quantity) + " of " + 
			    productCode + " at " + price; 
	}
	private int quantity;
	private double price;
	private String productCode;
}
