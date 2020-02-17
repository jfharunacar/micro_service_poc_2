package tr.com.jforce.kyc.service.impl;

import org.springframework.stereotype.Service;

import tr.com.jforce.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.kyc.model.KYCDeductionsModel;
import tr.com.jforce.kyc.service.IKYCService;

@Service(value = "kycServiceImpl")
public class KYCServiceImpl implements IKYCService{

	public KYCCustomerInformationModel getCustomerInfo(String naturalID) {
		// TODO Auto-generated method stub
		return null;
	}

	public KYCCMonthlyIncomeModel getMonthlyIncome(String naturalID) {
		// TODO Auto-generated method stub
		return null;
	}

	public KYCDeductionsModel getDeductions(String naturalID) {
		// TODO Auto-generated method stub
		return null;
	}

}
