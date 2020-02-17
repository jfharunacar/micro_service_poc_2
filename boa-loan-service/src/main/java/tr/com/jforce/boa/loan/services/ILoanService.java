package tr.com.jforce.boa.loan.services;

import tr.com.jforce.boa.loan.restservices.model.DTOLoanRequest;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanResponse;

public interface ILoanService  {

	DTOLoanResponse applyForALoan(DTOLoanRequest loanRequest) ;
}
