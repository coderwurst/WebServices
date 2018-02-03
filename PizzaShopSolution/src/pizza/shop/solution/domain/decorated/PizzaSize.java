package pizza.shop.solution.domain.decorated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TypeForPizzaSize")
@XmlEnum(String.class)
public enum PizzaSize {
	@XmlEnumValue("Short") SMALL,
	@XmlEnumValue("Tall") MEDIUM,
	@XmlEnumValue("Grande") LARGE
}
