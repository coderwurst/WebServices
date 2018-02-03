package pizza.shop.exercise;

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
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public int getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}
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
