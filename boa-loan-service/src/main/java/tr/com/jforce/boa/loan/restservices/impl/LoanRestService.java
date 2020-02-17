package tr.com.jforce.boa.loan.restservices.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import tr.com.jforce.boa.loan.restservices.BaseRestService;
import tr.com.jforce.boa.loan.restservices.definition.ILoanRestService;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanRequest;
import tr.com.jforce.boa.loan.restservices.model.DTOLoanResponse;
import tr.com.jforce.boa.loan.services.ILoanService;
import tr.com.jforce.boa.loan.system.exceptions.model.SystemErrorModel;
import tr.com.jforce.boa.mail.MailClient;

@RestController
@RequestMapping("/loan-service")
@Api(tags = { "LoanService" }, value = "Loan Services")
public class LoanRestService { //extends BaseRestService implements ILoanRestService 

	@Autowired
	private ILoanService loanService;
	
	@Autowired
	MailClient mailClient;
	
	@ResponseBody
	@ApiOperation(value = "ApplyForALoan", notes = "ApplyLoan")
	@RequestMapping(path = "/applyForALoan", method = RequestMethod.POST, produces = { "application/json" })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully apploy for a loan", response = DTOLoanRequest.class),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource", response = SystemErrorModel.class),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden", response = SystemErrorModel.class),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found", response = SystemErrorModel.class) })
	
	//@Override
	public DTOLoanResponse applyForALoan(@RequestBody @Valid DTOLoanRequest loanRequest) {
//		mailClient.sendMail(null);
		return loanService.applyForALoan(loanRequest);
		
		
 
	}

}
