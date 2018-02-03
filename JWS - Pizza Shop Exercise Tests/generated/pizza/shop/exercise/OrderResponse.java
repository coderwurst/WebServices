
package pizza.shop.exercise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YourOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderResponse", propOrder = {
    "yourOrder"
})
public class OrderResponse {

    @XmlElement(name = "YourOrder")
    protected String yourOrder;

    /**
     * Gets the value of the yourOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYourOrder() {
        return yourOrder;
    }

    /**
     * Sets the value of the yourOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYourOrder(String value) {
        this.yourOrder = value;
    }

}
