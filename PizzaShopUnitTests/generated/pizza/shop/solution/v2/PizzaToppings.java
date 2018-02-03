
package pizza.shop.solution.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pizzaToppings.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pizzaToppings">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PEPPERONI"/>
 *     &lt;enumeration value="MUSHROOM"/>
 *     &lt;enumeration value="PINEAPPLE"/>
 *     &lt;enumeration value="CHICKEN"/>
 *     &lt;enumeration value="ONION"/>
 *     &lt;enumeration value="TUNA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pizzaToppings")
@XmlEnum
public enum PizzaToppings {

    PEPPERONI,
    MUSHROOM,
    PINEAPPLE,
    CHICKEN,
    ONION,
    TUNA;

    public String value() {
        return name();
    }

    public static PizzaToppings fromValue(String v) {
        return valueOf(v);
    }

}
