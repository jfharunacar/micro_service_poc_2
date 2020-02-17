package tr.com.jforce.boa.extclients.dao.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transaction extends BaseDbModel{

	
	@Column(name = "customer_number",nullable = false)
	private String customerNumber;
	
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "transaction_date",nullable = false)
	private Date transactionDate;
	
	@Column(name = "amount",nullable = false)
	private BigDecimal amount;
	
	
	@Column(name = "short_description",nullable = false)
	private String shortDescription;


	public String getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
	
	
	
}
