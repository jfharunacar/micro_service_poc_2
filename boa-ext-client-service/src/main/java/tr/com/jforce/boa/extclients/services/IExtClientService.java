package tr.com.jforce.boa.extclients.services;

import tr.com.jforce.boa.extclients.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.boa.extclients.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.boa.extclients.kyc.model.KYCDeductionsModel;

public interface IExtClientService {

	public KYCCustomerInformationModel getCustomerInfo(String naturalID);

	public KYCCMonthlyIncomeModel getMonthlyIncome(String naturalID);

	public KYCDeductionsModel getDeductions(String naturalID);
}
