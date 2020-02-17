package tr.com.jforce.boa.extclients.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ODMLoanRequestModel {

	
	private BigDecimal requestAmount;
	
	private BigDecimal monthlyIncome;
	
	private List<ODMLoan> previousGrantedLoans;
	
	private BigDecimal interestRate;
	
	private Date startDateAtLastEmployeer;
	
	
	public Date getStartDateAtLastEmployeer() {
		return startDateAtLastEmployeer;
	}
	
	public void setStartDateAtLastEmployeer(Date startDateAtLastEmployeer) {
		this.startDateAtLastEmployeer = startDateAtLastEmployeer;
	}
	
	
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	

	public BigDecimal getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(BigDecimal requestAmount) {
		this.requestAmount = requestAmount;
	}

	public BigDecimal getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(BigDecimal monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public List<ODMLoan> getPreviousGrantedLoans() {
		return previousGrantedLoans;
	}

	public void setPreviousGrantedLoans(List<ODMLoan> previousGrantedLoans) {
		this.previousGrantedLoans = previousGrantedLoans;
	}
	
	
	
}
