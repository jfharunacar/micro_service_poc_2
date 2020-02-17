package tr.com.jforce.kyc.model;

public class KYCAdress {

	
	private String cityName;
	
	private String postalCode;
	
	private String fullAdress;

	public KYCAdress(String cityName, String postalCode, String fullAdress) {
		super();
		this.cityName = cityName;
		this.postalCode = postalCode;
		this.fullAdress = fullAdress;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFullAdress() {
		return fullAdress;
	}

	public void setFullAdress(String fullAdress) {
		this.fullAdress = fullAdress;
	}
	
	
	
}
