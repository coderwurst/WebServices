
package pizza.shop.solution.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placeOrderForPizza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placeOrderForPizza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chosenPizza" type="{http://v3.solution.shop.pizza/}pizza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeOrderForPizza", propOrder = {
    "chosenPizza"
})
public class PlaceOrderForPizza {

    protected Pizza chosenPizza;

    /**
     * Gets the value of the chosenPizza property.
     * 
     * @return
     *     possible object is
     *     {@link Pizza }
     *     
     */
    public Pizza getChosenPizza() {
        return chosenPizza;
    }

    /**
     * Sets the value of the chosenPizza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pizza }
     *     
     */
    public void setChosenPizza(Pizza value) {
        this.chosenPizza = value;
    }

}
