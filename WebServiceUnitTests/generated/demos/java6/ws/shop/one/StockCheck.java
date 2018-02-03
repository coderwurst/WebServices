
package demos.java6.ws.shop.one;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="noInStock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noOnOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockCheck", propOrder = {
    "noInStock",
    "noOnOrder"
})
public class StockCheck {

    protected int noInStock;
    protected int noOnOrder;

    /**
     * Gets the value of the noInStock property.
     * 
     */
    public int getNoInStock() {
        return noInStock;
    }

    /**
     * Sets the value of the noInStock property.
     * 
     */
    public void setNoInStock(int value) {
        this.noInStock = value;
    }

    /**
     * Gets the value of the noOnOrder property.
     * 
     */
    public int getNoOnOrder() {
        return noOnOrder;
    }

    /**
     * Sets the value of the noOnOrder property.
     * 
     */
    public void setNoOnOrder(int value) {
        this.noOnOrder = value;
    }

}
