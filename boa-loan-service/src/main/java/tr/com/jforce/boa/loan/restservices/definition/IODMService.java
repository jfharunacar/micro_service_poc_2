package tr.com.jforce.boa.loan.restservices.definition;

import org.springframework.web.bind.annotation.RequestBody;

import tr.com.jforce.boa.extclients.odm.model.ODMLoanRequestModel;
import tr.com.jforce.boa.extclients.odm.model.ODMLoanResponseModel;

public interface IODMService {

	ODMLoanResponseModel isLoanAcceptable(@RequestBody ODMLoanRequestModel loanRequestModel) ;
}
