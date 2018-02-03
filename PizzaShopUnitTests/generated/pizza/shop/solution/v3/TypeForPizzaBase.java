
package pizza.shop.solution.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeForPizzaBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeForPizzaBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Crispy"/>
 *     &lt;enumeration value="DeepPan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeForPizzaBase")
@XmlEnum
public enum TypeForPizzaBase {

    @XmlEnumValue("Crispy")
    CRISPY("Crispy"),
    @XmlEnumValue("DeepPan")
    DEEP_PAN("DeepPan");
    private final String value;

    TypeForPizzaBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeForPizzaBase fromValue(String v) {
        for (TypeForPizzaBase c: TypeForPizzaBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
