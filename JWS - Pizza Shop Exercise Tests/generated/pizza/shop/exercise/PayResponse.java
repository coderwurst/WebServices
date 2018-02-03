
package pizza.shop.exercise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentComplete" type="{http://exercise.shop.pizza/}OrderReceipt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payResponse", propOrder = {
    "paymentComplete"
})
public class PayResponse {

    @XmlElement(name = "PaymentComplete")
    protected OrderReceipt paymentComplete;

    /**
     * Gets the value of the paymentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReceipt }
     *     
     */
    public OrderReceipt getPaymentComplete() {
        return paymentComplete;
    }

    /**
     * Sets the value of the paymentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReceipt }
     *     
     */
    public void setPaymentComplete(OrderReceipt value) {
        this.paymentComplete = value;
    }

}
