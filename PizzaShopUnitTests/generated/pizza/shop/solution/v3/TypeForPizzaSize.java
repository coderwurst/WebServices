
package pizza.shop.solution.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeForPizzaSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeForPizzaSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Short"/>
 *     &lt;enumeration value="Tall"/>
 *     &lt;enumeration value="Grande"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeForPizzaSize")
@XmlEnum
public enum TypeForPizzaSize {

    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Tall")
    TALL("Tall"),
    @XmlEnumValue("Grande")
    GRANDE("Grande");
    private final String value;

    TypeForPizzaSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeForPizzaSize fromValue(String v) {
        for (TypeForPizzaSize c: TypeForPizzaSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
