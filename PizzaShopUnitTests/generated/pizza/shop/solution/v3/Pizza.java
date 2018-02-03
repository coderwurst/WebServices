
package pizza.shop.solution.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pizza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pizza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://v3.solution.shop.pizza/}TypeForPizzaBase" minOccurs="0"/>
 *         &lt;element name="size" type="{http://v3.solution.shop.pizza/}TypeForPizzaSize" minOccurs="0"/>
 *         &lt;element name="toppings" type="{http://v3.solution.shop.pizza/}TypeForPizzaTopppings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pizza", propOrder = {
    "base",
    "size",
    "toppings"
})
public class Pizza {

    protected TypeForPizzaBase base;
    protected TypeForPizzaSize size;
    @XmlElement(nillable = true)
    protected List<Integer> toppings;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForPizzaBase }
     *     
     */
    public TypeForPizzaBase getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForPizzaBase }
     *     
     */
    public void setBase(TypeForPizzaBase value) {
        this.base = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForPizzaSize }
     *     
     */
    public TypeForPizzaSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForPizzaSize }
     *     
     */
    public void setSize(TypeForPizzaSize value) {
        this.size = value;
    }

    /**
     * Gets the value of the toppings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toppings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToppings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getToppings() {
        if (toppings == null) {
            toppings = new ArrayList<Integer>();
        }
        return this.toppings;
    }

}
