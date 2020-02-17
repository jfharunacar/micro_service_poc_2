package tr.com.jforce.boa.extclients.service;

import javax.websocket.server.PathParam;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.jforce.boa.extclients.model.KYCCustomerInformationModel;

@FeignClient(name = "clientservice")
@RibbonClient(name = "clientservice")
public interface EXTService {

	@RequestMapping(method = RequestMethod.GET, value = "/kyc/customer-info/{naturalId}", consumes = "application/json")
	public KYCCustomerInformationModel getKYCInformation(@PathVariable(name = "naturalId") String naturalId);

	@RequestMapping(path = "/kyc/monthly-income/{naturalID}", method = RequestMethod.GET, produces = { "application/json" })
	public tr.com.jforce.boa.extclients.model.KYCCMonthlyIncomeModel getMonthlyIncome(@PathVariable(required = true, name = "naturalID") String naturalID);
}
