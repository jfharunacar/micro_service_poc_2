package tr.com.jforce.boa.loan.services.impl;

import org.springframework.stereotype.Service;

import tr.com.jforce.boa.extclients.odm.model.ODMLoanRequestModel;
import tr.com.jforce.boa.extclients.odm.model.ODMLoanResponseModel;
import tr.com.jforce.boa.loan.restservices.definition.IODMService;


@Service("odmService")
public class ODMServiceImpl implements IODMService{

	@Override
	public ODMLoanResponseModel isLoanAcceptable(ODMLoanRequestModel loanRequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
