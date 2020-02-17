package tr.com.jforce.boa.mail;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import tr.com.jforce.boa.loan.restservices.model.BaseMailRequest;
 
@FeignClient(name="mailservice")
@RibbonClient(name="mailservice")
public interface MailClient {

	

	@PostMapping("/rest/sendMail")
	SendMailResponse sendMail(BaseMailRequest sendMailRequest);
	
	
	
}
