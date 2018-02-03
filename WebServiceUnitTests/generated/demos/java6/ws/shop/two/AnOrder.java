
package demos.java6.ws.shop.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentifierOfBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemBeingPurchased" type="{http://two.shop.ws.java6.demos/}AnItem" minOccurs="0"/>
 *         &lt;element name="CostOfOrder" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NumberRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnOrder", propOrder = {
    "identifierOfBuyer",
    "itemBeingPurchased",
    "costOfOrder",
    "numberRequired"
})
public class AnOrder {

    @XmlElement(name = "IdentifierOfBuyer")
    protected String identifierOfBuyer;
    @XmlElement(name = "ItemBeingPurchased")
    protected AnItem itemBeingPurchased;
    @XmlElement(name = "CostOfOrder")
    protected double costOfOrder;
    @XmlElement(name = "NumberRequired")
    protected int numberRequired;

    /**
     * Gets the value of the identifierOfBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierOfBuyer() {
        return identifierOfBuyer;
    }

    /**
     * Sets the value of the identifierOfBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierOfBuyer(String value) {
        this.identifierOfBuyer = value;
    }

    /**
     * Gets the value of the itemBeingPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link AnItem }
     *     
     */
    public AnItem getItemBeingPurchased() {
        return itemBeingPurchased;
    }

    /**
     * Sets the value of the itemBeingPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnItem }
     *     
     */
    public void setItemBeingPurchased(AnItem value) {
        this.itemBeingPurchased = value;
    }

    /**
     * Gets the value of the costOfOrder property.
     * 
     */
    public double getCostOfOrder() {
        return costOfOrder;
    }

    /**
     * Sets the value of the costOfOrder property.
     * 
     */
    public void setCostOfOrder(double value) {
        this.costOfOrder = value;
    }

    /**
     * Gets the value of the numberRequired property.
     * 
     */
    public int getNumberRequired() {
        return numberRequired;
    }

    /**
     * Sets the value of the numberRequired property.
     * 
     */
    public void setNumberRequired(int value) {
        this.numberRequired = value;
    }

}
