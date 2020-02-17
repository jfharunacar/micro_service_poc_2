package tr.com.jforce.kyc.model;

public class KYCEmployer {

	
	private String employeeName;

	
	private String registrationNumber;
	
	
	
	
	public KYCEmployer(String employeeName, String registrationNumber) {
		super();
		this.employeeName = employeeName;
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
}
