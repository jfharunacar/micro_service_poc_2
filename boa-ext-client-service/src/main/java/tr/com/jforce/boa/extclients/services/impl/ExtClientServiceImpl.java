package tr.com.jforce.boa.extclients.services.impl;

import java.net.URI;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import tr.com.jforce.boa.extclients.kyc.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.boa.extclients.kyc.model.KYCCustomerInformationModel;
import tr.com.jforce.boa.extclients.kyc.model.KYCDeductionsModel;
import tr.com.jforce.boa.extclients.services.IExtClientService;

@Service
public class ExtClientServiceImpl implements IExtClientService{

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@Bean
	private RestTemplate template() {
		return new RestTemplate();
	}
	
	@PostConstruct
	public void intercepteroActions() {
		restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor(username, password));
	}
	
	@Value("${external.kyc.url}")
	private String url;
	
	@Value("${external.kyc.username}")
	private String username;
	
	@Value("${external.kyc.password}")
	private String password;
	
	@Value("${external.kyc.url.customerinfo}")
	private String customerinfo;
	
	@Value("${external.kyc.url.monthly-income}")
	private String monthlyIncome;
	
	@Value("${external.kyc.url.deductions}")
	private String deductions;
	
	 
	
	
	@Override
	public KYCCustomerInformationModel getCustomerInfo(String naturalID) {
		
		KYCCustomerInformationModel result = restTemplate.getForObject(url+customerinfo+naturalID, KYCCustomerInformationModel.class);
		return result;
	}


	@Override
	public KYCCMonthlyIncomeModel getMonthlyIncome(String naturalID) {
		KYCCMonthlyIncomeModel result = restTemplate.getForObject(url+monthlyIncome+naturalID, KYCCMonthlyIncomeModel.class);
		return result;
	}


	@Override
	public KYCDeductionsModel getDeductions(String naturalID) {
		KYCDeductionsModel result = restTemplate.getForObject(url+deductions+naturalID, KYCDeductionsModel.class);
		return result;
	}

}
