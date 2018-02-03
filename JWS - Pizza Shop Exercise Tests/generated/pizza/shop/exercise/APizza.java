
package pizza.shop.exercise;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APizza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APizza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PizzaBase" type="{http://exercise.shop.pizza/}pizzaBase" minOccurs="0"/>
 *         &lt;element name="PizzaSize" type="{http://exercise.shop.pizza/}pizzaSize" minOccurs="0"/>
 *         &lt;element name="PizzaToppings" type="{http://exercise.shop.pizza/}pizzaToppings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APizza", propOrder = {
    "pizzaBase",
    "pizzaSize",
    "pizzaToppings"
})
public class APizza {

    @XmlElement(name = "PizzaBase")
    protected Integer pizzaBase;
    @XmlElement(name = "PizzaSize")
    protected Integer pizzaSize;
    @XmlElement(name = "PizzaToppings")
    protected List<PizzaToppings> pizzaToppings;

    /**
     * Gets the value of the pizzaBase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPizzaBase() {
        return pizzaBase;
    }

    /**
     * Sets the value of the pizzaBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPizzaBase(Integer value) {
        this.pizzaBase = value;
    }

    /**
     * Gets the value of the pizzaSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPizzaSize() {
        return pizzaSize;
    }

    /**
     * Sets the value of the pizzaSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPizzaSize(Integer value) {
        this.pizzaSize = value;
    }

    /**
     * Gets the value of the pizzaToppings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pizzaToppings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPizzaToppings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PizzaToppings }
     * 
     * 
     */
    public List<PizzaToppings> getPizzaToppings() {
        if (pizzaToppings == null) {
            pizzaToppings = new ArrayList<PizzaToppings>();
        }
        return this.pizzaToppings;
    }

}
