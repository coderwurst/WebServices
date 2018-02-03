
package pizza.shop.solution.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseYourPizzaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseYourPizzaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YourReceipt" type="{http://v3.solution.shop.pizza/}TypeForReceipt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseYourPizzaResponse", propOrder = {
    "yourReceipt"
})
public class PurchaseYourPizzaResponse {

    @XmlElement(name = "YourReceipt")
    protected TypeForReceipt yourReceipt;

    /**
     * Gets the value of the yourReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForReceipt }
     *     
     */
    public TypeForReceipt getYourReceipt() {
        return yourReceipt;
    }

    /**
     * Sets the value of the yourReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForReceipt }
     *     
     */
    public void setYourReceipt(TypeForReceipt value) {
        this.yourReceipt = value;
    }

}
