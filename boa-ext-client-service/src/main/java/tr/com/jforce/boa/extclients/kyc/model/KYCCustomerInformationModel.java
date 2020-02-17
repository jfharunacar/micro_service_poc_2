package tr.com.jforce.boa.extclients.kyc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Harun.ACAR
 *
 */
public class KYCCustomerInformationModel implements Serializable{

	
	private KYCAdress adress;
	
	private KYCEmployer lastEmployer;
	
	private Date lastEmployerStartDate;

	private String naturalId;
	
	public KYCCustomerInformationModel() {
		// TODO Auto-generated constructor stub
	}
	public KYCCustomerInformationModel(KYCAdress adress, KYCEmployer lastEmployer, Date lastEmployerStartDate,String naturalId) {
		super();
		this.adress = adress;
		this.lastEmployer = lastEmployer;
		this.lastEmployerStartDate = lastEmployerStartDate;
		this.naturalId=naturalId;
	}

	
	public String getNaturalId() {
		return naturalId;
	}
	
	public void setNaturalId(String naturalId) {
		this.naturalId = naturalId;
	}
	
	public KYCAdress getAdress() {
		return adress;
	}

	public void setAdress(KYCAdress adress) {
		this.adress = adress;
	}

	public KYCEmployer getLastEmployer() {
		return lastEmployer;
	}

	public void setLastEmployer(KYCEmployer lastEmployer) {
		this.lastEmployer = lastEmployer;
	}

	public Date getLastEmployerStartDate() {
		return lastEmployerStartDate;
	}

	public void setLastEmployerStartDate(Date lastEmployerStartDate) {
		this.lastEmployerStartDate = lastEmployerStartDate;
	}
	
	
	
	
	
}
