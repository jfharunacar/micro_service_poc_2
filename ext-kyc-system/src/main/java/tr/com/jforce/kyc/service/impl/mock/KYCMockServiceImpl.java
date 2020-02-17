package tr.com.jforce.kyc.service.impl.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import tr.com.jforce.kyc.model.KYCAdress;
import tr.com.jforce.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.kyc.model.KYCDeduction;
import tr.com.jforce.kyc.model.KYCDeductionsModel;
import tr.com.jforce.kyc.model.KYCEmployer;
import tr.com.jforce.kyc.service.IKYCService;

@Service("kycMockServiceImpl")
public class KYCMockServiceImpl implements IKYCService{

	private static HashMap<String, KYCCustomerInformationModel> customerData;
	
	private static HashMap<String, KYCCMonthlyIncomeModel> montlyIncomeModel;
	
	
	private static HashMap<String, KYCDeductionsModel> deductionModel;
	
	@PostConstruct
	public void initialize() {
		customerData=new HashMap<String, KYCCustomerInformationModel>();
		
		
		customerData.put("1", new KYCCustomerInformationModel(new KYCAdress("Baku", "12131123", "Bakuu"), new KYCEmployer("jforce", "999"), Calendar.getInstance().getTime(),"1"));
		
		customerData.put("2", new KYCCustomerInformationModel(new KYCAdress("Baku", "22111", "Gence"), new KYCEmployer("BAO", "888"), Calendar.getInstance().getTime(),"2"));
		
		
		montlyIncomeModel=new HashMap<String, KYCCMonthlyIncomeModel>();
		
		
		montlyIncomeModel.put("1", new KYCCMonthlyIncomeModel("1",new BigDecimal("100000"),new BigDecimal("100.1")));
		
		montlyIncomeModel.put("2", new KYCCMonthlyIncomeModel("1",new BigDecimal("250000"),new BigDecimal("120.1")));
		
		
		
		
		
		deductionModel=new HashMap<String, KYCDeductionsModel>();
		
		deductionModel.put("1", new KYCDeductionsModel("1", new ArrayList<KYCDeduction>() {{
			add(new KYCDeduction(new BigDecimal("1000"), 2020, 2,"Income Tax"));
			add(new KYCDeduction(new BigDecimal("10.1"), 2020, 2,"Unusual expenses Tax"));
			
			add(new KYCDeduction(new BigDecimal("998"), 2020, 1,"Income Tax"));
			add(new KYCDeduction(new BigDecimal("3.1"), 2020, 1,"Unusual expenses Tax"));
		}}));
		
		deductionModel.put("2", new KYCDeductionsModel("2", new ArrayList<KYCDeduction>() {{
			add(new KYCDeduction(new BigDecimal("2498.12"), 2020, 2,"Income Tax"));
			add(new KYCDeduction(new BigDecimal("100.1"), 2020, 2,"Unusual expenses Tax"));
			
			add(new KYCDeduction(new BigDecimal("2198.11"), 2020, 1,"Income Tax"));
			add(new KYCDeduction(new BigDecimal("131.1"), 2020, 1,"Unusual expenses Tax"));
		}}));
	}
	public KYCCustomerInformationModel getCustomerInfo(String naturalID) {
		if(customerData.containsKey(naturalID)) {
			return customerData.get(naturalID);
		}
		return null;
	}
	public KYCCMonthlyIncomeModel getMonthlyIncome(String naturalID) {
		if(montlyIncomeModel.containsKey(naturalID)) {
			return montlyIncomeModel.get(naturalID);
		}
		return null;
	}
	public KYCDeductionsModel getDeductions(String naturalID) {
		if(deductionModel.containsKey(naturalID)) {
			return deductionModel.get(naturalID);
		}
		return null;
	}

}
