package tr.com.jforce.boa.loan.restservices.model;

public class DTOLoanResponse extends DTOBaseModel{

	
	private Long transactionId;
	
	private String message;

	private boolean success;
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
