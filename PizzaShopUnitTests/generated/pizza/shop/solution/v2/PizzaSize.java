
package pizza.shop.solution.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pizzaSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pizzaSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMALL"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="LARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pizzaSize")
@XmlEnum
public enum PizzaSize {

    SMALL,
    MEDIUM,
    LARGE;

    public String value() {
        return name();
    }

    public static PizzaSize fromValue(String v) {
        return valueOf(v);
    }

}
