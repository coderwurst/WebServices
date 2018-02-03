
package demos.java6.ws.shop.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCatalogCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierReferenceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnItem", propOrder = {
    "productCatalogCode",
    "supplierReferenceNum"
})
public class AnItem {

    @XmlElement(name = "ProductCatalogCode")
    protected String productCatalogCode;
    @XmlElement(name = "SupplierReferenceNum")
    protected String supplierReferenceNum;

    /**
     * Gets the value of the productCatalogCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCatalogCode() {
        return productCatalogCode;
    }

    /**
     * Sets the value of the productCatalogCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCatalogCode(String value) {
        this.productCatalogCode = value;
    }

    /**
     * Gets the value of the supplierReferenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierReferenceNum() {
        return supplierReferenceNum;
    }

    /**
     * Sets the value of the supplierReferenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierReferenceNum(String value) {
        this.supplierReferenceNum = value;
    }

}
