package demos.jaxb.unmarshall;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnOrder")
public class Order {
	@XmlEnum(Integer.class)
	public enum Priority {
		@XmlEnumValue("1") NEXT_DAY, 
		@XmlEnumValue("2") URGENT, 
		@XmlEnumValue("3") STANDARD 
	}
	public Order() {
		super();
    }
    public Order(String buyerID, Priority priority) {
    	super();
        items = new ArrayList<Item>();
        this.buyerID = buyerID;
        this.priority = priority;
    }
    public void add(Item item) {
		items.add(item);
	}
	public String getBuyerID() {
		return buyerID;
	}
	public Priority getPriority() {
		return priority;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order for ");
		builder.append(buyerID);
		builder.append(" with priority ");
		builder.append(priority);
		builder.append("\n");
		for(Item item : items) {
			builder.append("\t");
			builder.append(item);
			builder.append("\n");
		}
		return builder.toString();
	}
	@XmlElement(name="Item")
    private List<Item> items;
    @XmlAttribute(name="buyerID")
    private String buyerID;
    @XmlAttribute(name="priority")
    private Priority priority;
}
