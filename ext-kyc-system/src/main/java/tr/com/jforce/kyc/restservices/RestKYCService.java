package tr.com.jforce.kyc.restservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.jforce.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.kyc.model.KYCDeductionsModel;
import tr.com.jforce.kyc.service.IKYCService;

@RestController
@RequestMapping("/kyc")
public class RestKYCService  {
 
	 
	
	@Autowired
	@Qualifier(value = "kycMockServiceImpl")
	private IKYCService kycService;
	 
	
	
	@RequestMapping(path = "/customer-info/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public KYCCustomerInformationModel getKYCInformation( @PathVariable(required = true,name = "naturalID") String naturalID) {
		return kycService.getCustomerInfo(naturalID);
	}

	
	@RequestMapping(path = "/monthly-income/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public KYCCMonthlyIncomeModel getMonthlyIncome( @PathVariable(required = true,name = "naturalID") String naturalID) {
		return kycService.getMonthlyIncome(naturalID);
	}
	
	
	@RequestMapping(path = "/deductions/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public KYCDeductionsModel getDeductions( @PathVariable(required = true,name = "naturalID") String naturalID) {
		return kycService.getDeductions(naturalID);
	}
	
}