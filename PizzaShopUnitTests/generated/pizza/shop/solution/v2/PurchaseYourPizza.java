
package pizza.shop.solution.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseYourPizza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseYourPizza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TheOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YourCreditCard" type="{http://v2.solution.shop.pizza/}creditCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseYourPizza", propOrder = {
    "theOrderId",
    "yourCreditCard"
})
public class PurchaseYourPizza {

    @XmlElement(name = "TheOrderId")
    protected String theOrderId;
    @XmlElement(name = "YourCreditCard")
    protected CreditCard yourCreditCard;

    /**
     * Gets the value of the theOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheOrderId() {
        return theOrderId;
    }

    /**
     * Sets the value of the theOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheOrderId(String value) {
        this.theOrderId = value;
    }

    /**
     * Gets the value of the yourCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getYourCreditCard() {
        return yourCreditCard;
    }

    /**
     * Sets the value of the yourCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setYourCreditCard(CreditCard value) {
        this.yourCreditCard = value;
    }

}
