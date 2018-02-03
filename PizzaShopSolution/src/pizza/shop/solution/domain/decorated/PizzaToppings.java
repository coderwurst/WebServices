package pizza.shop.solution.domain.decorated;

import javax.xml.bind.annotation.*;

@XmlType(name="TypeForPizzaTopppings")
@XmlEnum(Integer.class)
public enum PizzaToppings {
	@XmlEnumValue("0") PEPPERONI,
	@XmlEnumValue("1") MUSHROOM,
	@XmlEnumValue("2") PINEAPPLE,
	@XmlEnumValue("3") CHICKEN,
	@XmlEnumValue("4") ONION,
	@XmlEnumValue("5") TUNA
}
