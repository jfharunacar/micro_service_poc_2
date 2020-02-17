package tr.com.jforce.boa.loan.services.impl;

import java.math.BigDecimal;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.springframework.stereotype.Service;

import tr.com.jforce.boa.extclients.odm.model.ODMLoan;
import tr.com.jforce.boa.extclients.odm.model.ODMLoanRequestModel;
import tr.com.jforce.boa.extclients.odm.model.ODMLoanResponseModel;
import tr.com.jforce.boa.loan.restservices.definition.IODMService;


@Service("odmMockServiceImpl")
public class ODMMockServiceImpl implements IODMService{

	@Override
	public ODMLoanResponseModel isLoanAcceptable(ODMLoanRequestModel loanRequestModel) {
		ODMLoanResponseModel response=new ODMLoanResponseModel();
		
		
		BigDecimal sumgrantedLoanAmount=BigDecimal.ZERO;
		if(loanRequestModel.getPreviousGrantedLoans()!=null && loanRequestModel.getPreviousGrantedLoans().size()>0) {
			for (ODMLoan loan : loanRequestModel.getPreviousGrantedLoans()) {
				if(loan.getAmount()!=null) {
					sumgrantedLoanAmount=sumgrantedLoanAmount.add(loan.getAmount());
				}
			}
			
		}
		
		BigDecimal sum=sumgrantedLoanAmount.add(loanRequestModel.getRequestAmount()==null?BigDecimal.ZERO:loanRequestModel.getRequestAmount());
		
		BigDecimal sumWithInterestDate=sum.multiply(loanRequestModel.getInterestRate());
		
		BigDecimal a=loanRequestModel.getMonthlyIncome().subtract(sumWithInterestDate);
		
		
		boolean valid1=a.compareTo(BigDecimal.ONE)>=0;
		
		DateTime now=new DateTime();
		
		Duration duration = new Duration(now, new DateTime(loanRequestModel.getStartDateAtLastEmployeer()));
		
		long days=duration.getStandardDays();
		
		boolean valid2=days<=90;
		
		response.setAccepted(valid1 && valid2);
		
		response.setGrantedAmount(loanRequestModel.getRequestAmount());
		
		return response;
	}

}
