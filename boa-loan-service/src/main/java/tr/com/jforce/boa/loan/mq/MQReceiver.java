package tr.com.jforce.boa.loan.mq;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import tr.com.jforce.boa.extclients.model.KYCCMonthlyIncomeModel;
import tr.com.jforce.boa.extclients.model.KYCCustomerInformationModel;
import tr.com.jforce.boa.extclients.odm.model.ODMLoan;
import tr.com.jforce.boa.extclients.odm.model.ODMLoanRequestModel;
import tr.com.jforce.boa.extclients.odm.model.ODMLoanResponseModel;
import tr.com.jforce.boa.extclients.service.EXTService;
import tr.com.jforce.boa.loan.restservices.definition.IODMService;
import tr.com.jforce.boa.loan.restservices.model.BaseMailRequest;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanRequest;
import tr.com.jforce.boa.mail.MailClient;
import tr.com.jforce.statics.IConstants;

@Service
public class MQReceiver {

	
	@Autowired
	private MailClient mailClient;
	
	@Autowired
	private EXTService extService;
	
	@Qualifier("odmMockServiceImpl")
	@Autowired
	private IODMService odmService;
	
	@Value("${mail.defaultmail}")
	private String defaultmail;
	
	@JmsListener(destination = IConstants.QUEE_NAME)
    public void receiveMessage(DTOLoanRequest loanRequest) {
		
        System.out.println("DEV.QUEUE.1 received ~" + loanRequest.getNaturalId() + "~");
        loanRequest.setNaturalId("1");
        KYCCustomerInformationModel customerModel =extService.getKYCInformation(loanRequest.getNaturalId());
        if(customerModel==null) {
        	throw new RuntimeException(loanRequest.getNaturalId()+" is not valid");
        }
        
        KYCCMonthlyIncomeModel monthyIncomeValues = extService.getMonthlyIncome(loanRequest.getNaturalId());

        
        if(monthyIncomeValues==null) {
        	throw new RuntimeException(loanRequest.getNaturalId()+" is not valid");
        }
        
        ODMLoanRequestModel odmRequest=new ODMLoanRequestModel();;
        
        odmRequest.setMonthlyIncome(monthyIncomeValues.getMonthlyIncome());
        odmRequest.setRequestAmount(loanRequest.getRequestLoanAmount());
        odmRequest.setStartDateAtLastEmployeer(customerModel.getLastEmployerStartDate());
        odmRequest.setPreviousGrantedLoans(new ArrayList<ODMLoan>());
        odmRequest.setInterestRate(new BigDecimal("9.25"));
		ODMLoanResponseModel odmResponse = odmService.isLoanAcceptable(odmRequest);
        
		BaseMailRequest mailRequest=new BaseMailRequest();
		
		mailRequest.setTo(defaultmail);
		mailRequest.setSubject("Loan Information");
		if(odmResponse.isAccepted()) {
			mailRequest.setContent("Loan is accepted");
		}else {
			mailRequest.setContent("Loan is not accepted");
		}
		try {
			mailClient.sendMail(mailRequest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
    }
}
