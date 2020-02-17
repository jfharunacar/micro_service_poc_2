package tr.com.jforce.boa.loan.exceptions;

import tr.com.jforce.boa.loan.restservices.model.DTOLoanRequest;

public class LoanException extends RuntimeException{

	private DTOLoanRequest loanRequst;
	
	public LoanException(DTOLoanRequest loanRequst,Throwable e) {
		super(e);
		this.loanRequst=loanRequst;
	}
	
	public DTOLoanRequest getLoanRequst() {
		return loanRequst;
	}
	
}
