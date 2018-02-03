
package pizza.shop.solution.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pizzaBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pizzaBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="THIN"/>
 *     &lt;enumeration value="THICK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pizzaBase")
@XmlEnum
public enum PizzaBase {

    THIN,
    THICK;

    public String value() {
        return name();
    }

    public static PizzaBase fromValue(String v) {
        return valueOf(v);
    }

}
