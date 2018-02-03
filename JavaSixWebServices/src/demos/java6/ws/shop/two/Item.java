package demos.java6.ws.shop.two;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AnItem")
public class Item {
	public Item() {
		super();
	}
	public Item(String supplierCode, String productCode) {
		super();
		this.supplierCode = supplierCode;
		this.productCode = productCode;
	}
	@XmlElement(name="ProductCatalogCode")
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	@XmlElement(name="SupplierReferenceNum")
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	private String supplierCode;
	private String productCode;
}
