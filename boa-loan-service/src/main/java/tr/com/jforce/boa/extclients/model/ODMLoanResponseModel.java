package tr.com.jforce.boa.extclients.model;

import java.math.BigDecimal;
import java.util.List;

public class ODMLoanResponseModel {

	
	private boolean accepted;
	
	private List<String> messages;
	
	private BigDecimal grantedAmount;

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public BigDecimal getGrantedAmount() {
		return grantedAmount;
	}

	public void setGrantedAmount(BigDecimal grantedAmount) {
		this.grantedAmount = grantedAmount;
	}
	
	
	
}
