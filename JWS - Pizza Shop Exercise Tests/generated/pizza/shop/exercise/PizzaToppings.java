
package pizza.shop.exercise;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pizzaToppings.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pizzaToppings">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pepperoni"/>
 *     &lt;enumeration value="mushroom"/>
 *     &lt;enumeration value="pineapple"/>
 *     &lt;enumeration value="chicken"/>
 *     &lt;enumeration value="onion"/>
 *     &lt;enumeration value="tuna"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pizzaToppings")
@XmlEnum
public enum PizzaToppings {

    @XmlEnumValue("pepperoni")
    PEPPERONI("pepperoni"),
    @XmlEnumValue("mushroom")
    MUSHROOM("mushroom"),
    @XmlEnumValue("pineapple")
    PINEAPPLE("pineapple"),
    @XmlEnumValue("chicken")
    CHICKEN("chicken"),
    @XmlEnumValue("onion")
    ONION("onion"),
    @XmlEnumValue("tuna")
    TUNA("tuna");
    private final String value;

    PizzaToppings(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PizzaToppings fromValue(String v) {
        for (PizzaToppings c: PizzaToppings.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
