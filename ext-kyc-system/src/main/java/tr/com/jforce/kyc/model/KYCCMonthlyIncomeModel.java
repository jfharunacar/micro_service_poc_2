package tr.com.jforce.kyc.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author Harun.ACAR
 *
 */
public class KYCCMonthlyIncomeModel {

	
	private String naturalId;
	
	 private BigDecimal monthlyIncome;
	
	
	private BigDecimal interruption;


	public KYCCMonthlyIncomeModel() {
		// TODO Auto-generated constructor stub
	}
	public KYCCMonthlyIncomeModel(String naturalId, BigDecimal monthlyIncome, BigDecimal interruption) {
		super();
		this.naturalId = naturalId;
		this.monthlyIncome = monthlyIncome;
		this.interruption = interruption;
	}


	public String getNaturalId() {
		return naturalId;
	}


	public void setNaturalId(String naturalId) {
		this.naturalId = naturalId;
	}


	public BigDecimal getMonthlyIncome() {
		return monthlyIncome;
	}


	public void setMonthlyIncome(BigDecimal monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}


	public BigDecimal getInterruption() {
		return interruption;
	}


	public void setInterruption(BigDecimal interruption) {
		this.interruption = interruption;
	}
	
	
}
