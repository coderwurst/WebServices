
package pizza.shop.solution.v1;

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
 *         &lt;element name="base" type="{http://v1.solution.shop.pizza/}pizzaBase" minOccurs="0"/>
 *         &lt;element name="size" type="{http://v1.solution.shop.pizza/}pizzaSize" minOccurs="0"/>
 *         &lt;element name="toppings" type="{http://v1.solution.shop.pizza/}pizzaToppings" maxOccurs="unbounded" minOccurs="0"/>
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

    protected PizzaBase base;
    protected PizzaSize size;
    @XmlElement(nillable = true)
    protected List<PizzaToppings> toppings;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link PizzaBase }
     *     
     */
    public PizzaBase getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link PizzaBase }
     *     
     */
    public void setBase(PizzaBase value) {
        this.base = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link PizzaSize }
     *     
     */
    public PizzaSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link PizzaSize }
     *     
     */
    public void setSize(PizzaSize value) {
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
     * {@link PizzaToppings }
     * 
     * 
     */
    public List<PizzaToppings> getToppings() {
        if (toppings == null) {
            toppings = new ArrayList<PizzaToppings>();
        }
        return this.toppings;
    }

}
