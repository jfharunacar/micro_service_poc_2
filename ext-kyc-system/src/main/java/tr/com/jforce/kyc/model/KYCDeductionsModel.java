package tr.com.jforce.kyc.model;

import java.util.List;

public class KYCDeductionsModel {

	
	private String naturalId;
	
	private List<KYCDeduction> deductions;

	
	
	public KYCDeductionsModel(String naturalId, List<KYCDeduction> deductions) {
		super();
		this.naturalId = naturalId;
		this.deductions = deductions;
	}

	public String getNaturalId() {
		return naturalId;
	}

	public void setNaturalId(String naturalId) {
		this.naturalId = naturalId;
	}

	public List<KYCDeduction> getDeductions() {
		return deductions;
	}

	public void setDeductions(List<KYCDeduction> deductions) {
		this.deductions = deductions;
	}
	
	
	
}
