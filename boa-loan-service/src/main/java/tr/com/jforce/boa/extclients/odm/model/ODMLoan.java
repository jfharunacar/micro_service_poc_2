package tr.com.jforce.boa.extclients.odm.model;

import java.math.BigDecimal;
import java.util.Date;

public class ODMLoan {

	
	private BigDecimal amount;
	
	private Date loanDate;
	
	private Integer numberOfInstallments;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Integer numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	
	
}
