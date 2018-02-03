package pizza.shop.exercise;

public class Pizza {
	public Pizza() {
		super();
	}
	public Pizza(PizzaSize size, PizzaBase base, PizzaToppings[] toppings) {
		super();
		this.size = size;
		this.base = base;
		this.toppings = toppings;
	}
	public PizzaSize getSize() {
		return size;
	}
	public void setSize(PizzaSize size) {
		this.size = size;
	}
	public PizzaBase getBase() {
		return base;
	}
	public void setBase(PizzaBase base) {
		this.base = base;
	}
	public PizzaToppings[] getToppings() {
		return toppings;
	}
	public void setToppings(PizzaToppings[] toppings) {
		this.toppings = toppings;
	}
	private PizzaSize size;
	private PizzaBase base;
	private PizzaToppings [] toppings;
}
