
package pizza.shop.solution.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeForCreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeForCreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardIssueNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cardOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeForCreditCard")
public class TypeForCreditCard {

    @XmlAttribute
    protected String cardNumber;
    @XmlAttribute(required = true)
    protected int cardIssueNumber;
    @XmlAttribute
    protected String cardOwnerName;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardIssueNumber property.
     * 
     */
    public int getCardIssueNumber() {
        return cardIssueNumber;
    }

    /**
     * Sets the value of the cardIssueNumber property.
     * 
     */
    public void setCardIssueNumber(int value) {
        this.cardIssueNumber = value;
    }

    /**
     * Gets the value of the cardOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    /**
     * Sets the value of the cardOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOwnerName(String value) {
        this.cardOwnerName = value;
    }

}
