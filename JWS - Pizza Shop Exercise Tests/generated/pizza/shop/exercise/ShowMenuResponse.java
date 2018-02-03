
package pizza.shop.exercise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showMenuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="showMenuResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TodaysMenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showMenuResponse", propOrder = {
    "todaysMenu"
})
public class ShowMenuResponse {

    @XmlElement(name = "TodaysMenu")
    protected String todaysMenu;

    /**
     * Gets the value of the todaysMenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTodaysMenu() {
        return todaysMenu;
    }

    /**
     * Sets the value of the todaysMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTodaysMenu(String value) {
        this.todaysMenu = value;
    }

}
