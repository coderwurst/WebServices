
package pizza.shop.solution.v2;

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
 *         &lt;element name="YourReceipt" type="{http://v2.solution.shop.pizza/}receipt" minOccurs="0"/>
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
    protected Receipt yourReceipt;

    /**
     * Gets the value of the yourReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Receipt }
     *     
     */
    public Receipt getYourReceipt() {
        return yourReceipt;
    }

    /**
     * Sets the value of the yourReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receipt }
     *     
     */
    public void setYourReceipt(Receipt value) {
        this.yourReceipt = value;
    }

}
