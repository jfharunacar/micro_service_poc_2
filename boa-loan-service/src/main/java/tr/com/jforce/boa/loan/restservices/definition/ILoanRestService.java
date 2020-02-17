package tr.com.jforce.boa.loan.restservices.definition;

import java.util.List;

import tr.com.jforce.boa.loan.restservices.model.DTOLoanRequest;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanResponse;

public interface ILoanRestService {

	
	DTOLoanResponse applyForALoan(DTOLoanRequest loanRequest);
}
