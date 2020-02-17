package tr.com.jforce.boa.extclients.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class KYCDeduction implements Serializable{

	
	private BigDecimal amount;
	
	private Integer deductionYear;
	
	private Integer deductionMonth;

	private String reason;
	
	
	public KYCDeduction(BigDecimal amount, Integer deductionYear, Integer deductionMonth,String reason) {
		super();
		this.amount = amount;
		this.deductionYear = deductionYear;
		this.deductionMonth = deductionMonth;
		
		this.reason=reason;
	}
	
	public KYCDeduction() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getAmount() {
		return amount;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getDeductionYear() {
		return deductionYear;
	}

	public void setDeductionYear(Integer deductionYear) {
		this.deductionYear = deductionYear;
	}

	public Integer getDeductionMonth() {
		return deductionMonth;
	}

	public void setDeductionMonth(Integer deductionMonth) {
		this.deductionMonth = deductionMonth;
	}
	
	
	
}
