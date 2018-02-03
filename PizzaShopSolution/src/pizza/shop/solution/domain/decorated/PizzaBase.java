package pizza.shop.solution.domain.decorated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TypeForPizzaBase")
@XmlEnum(String.class)
public enum PizzaBase {
	@XmlEnumValue("Crispy") THIN,
	@XmlEnumValue("DeepPan") THICK
}
