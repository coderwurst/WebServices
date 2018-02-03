
package pizza.shop.solution.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TypeForReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeForReceipt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CostOfOrder" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IdOfOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeOfOrder" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeForReceipt", propOrder = {
    "costOfOrder",
    "idOfOrder",
    "timeOfOrder"
})
public class TypeForReceipt {

    @XmlElement(name = "CostOfOrder")
    protected double costOfOrder;
    @XmlElement(name = "IdOfOrder")
    protected String idOfOrder;
    @XmlElement(name = "TimeOfOrder")
    protected XMLGregorianCalendar timeOfOrder;

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
     * Gets the value of the idOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOfOrder() {
        return idOfOrder;
    }

    /**
     * Sets the value of the idOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOfOrder(String value) {
        this.idOfOrder = value;
    }

    /**
     * Gets the value of the timeOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfOrder() {
        return timeOfOrder;
    }

    /**
     * Sets the value of the timeOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfOrder(XMLGregorianCalendar value) {
        this.timeOfOrder = value;
    }

}
