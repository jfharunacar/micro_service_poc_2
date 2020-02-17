package tr.com.jforce.kyc.service;

import tr.com.jforce.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.kyc.model.KYCDeductionsModel;

public interface IKYCService {

	
	public KYCCustomerInformationModel getCustomerInfo(String naturalID);
	
	public KYCCMonthlyIncomeModel getMonthlyIncome(String naturalID);
	
	public KYCDeductionsModel getDeductions(String naturalID);
}
