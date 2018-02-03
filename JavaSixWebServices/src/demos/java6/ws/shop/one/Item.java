package demos.java6.ws.shop.one;

public class Item {
	public Item() {
		super();
	}
	public Item(String supplierCode, String productCode) {
		super();
		this.supplierCode = supplierCode;
		this.productCode = productCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	private String supplierCode;
	private String productCode;
}
