package pizza.shop.solution.domain.decorated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TypeForCreditCard")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CreditCard {
	public CreditCard() {
		super();
	}
	public CreditCard(String cardId, int issueNum, String name) {
		super();
		this.cardId = cardId;
		this.issueNum = issueNum;
		this.name = name;
	}
	@XmlAttribute(name="cardNumber")
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	@XmlAttribute(name="cardIssueNumber")
	public int getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}
	@XmlAttribute(name="cardOwnerName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String cardId;
	private int issueNum;
	private String name;
}
