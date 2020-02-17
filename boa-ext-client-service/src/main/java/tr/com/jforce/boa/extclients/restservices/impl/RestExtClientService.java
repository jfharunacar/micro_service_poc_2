package tr.com.jforce.boa.extclients.restservices.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tr.com.jforce.boa.extclients.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.boa.extclients.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.boa.extclients.kyc.model.KYCDeductionsModel;
import tr.com.jforce.boa.extclients.restservices.BaseRestService;
import tr.com.jforce.boa.extclients.services.IExtClientService;

@RestController
//@RequestMapping("/external")
@Api(tags = { "ExternalSystem" }, value = "External Systems Services")
public class RestExtClientService extends BaseRestService   {

	
	@Autowired
	private IExtClientService extClientService;
	
	
	
	@Cacheable(cacheNames = "kycInformations",key ="#naturalID" )
	@RequestMapping(path = "/kyc/customer-info/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public KYCCustomerInformationModel getKYCInformation( @PathVariable(required = true,name = "naturalID") String naturalID) {
		
		return extClientService.getCustomerInfo(naturalID);
	}
	
	@Cacheable(cacheNames = "kycMonthlyIncome",key ="#naturalID" )
	@RequestMapping(path = "/kyc/monthly-income/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public KYCCMonthlyIncomeModel getMonthlyIncome( @PathVariable(required = true,name = "naturalID") String naturalID) {
		
		return extClientService.getMonthlyIncome(naturalID);
	}
	
	@Cacheable(cacheNames = "kycDeductions",key ="#naturalID" )
	@RequestMapping(path = "/kyc/deductions/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public KYCDeductionsModel getDeductions( @PathVariable(required = true,name = "naturalID") String naturalID) {
		
		return extClientService.getDeductions(naturalID);
	}

	
}
