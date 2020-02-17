package tr.com.jforce.boa.loan.services.impl;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import tr.com.jforce.boa.extclients.service.EXTService;
import tr.com.jforce.boa.loan.exceptions.LoanException;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanRequest;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanResponse;
import tr.com.jforce.boa.loan.services.ILoanService;
import tr.com.jforce.statics.IConstants;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LoanServiceImpl   implements ILoanService{

	private AtomicLong transactionId=new AtomicLong();
	@Autowired
	private JmsTemplate jmsTemplate;
//
//	@Autowired
//	 EXTService extService;
	
	@Override
	public DTOLoanResponse applyForALoan(DTOLoanRequest loanRequest) {
		Long requestID=transactionId.incrementAndGet();
		loanRequest.setRequestId(requestID);
		DTOLoanResponse response=new DTOLoanResponse();
		try {
			jmsTemplate.convertAndSend(IConstants.QUEE_NAME, loanRequest);
			response.setTransactionId(loanRequest.getRequestId());
			response.setMessage("Your request saved with "+loanRequest.getRequestId());
			response.setSuccess(true);
		}catch (Exception e) {
			response.setSuccess(false);
			response.setMessage("Please try again");
		}
		return response;
	}
	 
	
}
