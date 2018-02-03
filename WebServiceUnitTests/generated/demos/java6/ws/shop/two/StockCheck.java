
package demos.java6.ws.shop.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stockCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stockCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="numberStocked" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="numberOnOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockCheck")
public class StockCheck {

    @XmlAttribute(required = true)
    protected int numberStocked;
    @XmlAttribute(required = true)
    protected int numberOnOrder;

    /**
     * Gets the value of the numberStocked property.
     * 
     */
    public int getNumberStocked() {
        return numberStocked;
    }

    /**
     * Sets the value of the numberStocked property.
     * 
     */
    public void setNumberStocked(int value) {
        this.numberStocked = value;
    }

    /**
     * Gets the value of the numberOnOrder property.
     * 
     */
    public int getNumberOnOrder() {
        return numberOnOrder;
    }

    /**
     * Sets the value of the numberOnOrder property.
     * 
     */
    public void setNumberOnOrder(int value) {
        this.numberOnOrder = value;
    }

}
