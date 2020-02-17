package tr.com.jforce.boa.loan.restservices.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DTOLoanRequest extends DTOBaseModel{

	
	@JsonIgnore
	private Long requestId;
	
	
	@NotBlank(message = "Natural ID is required")
	private String naturalId;
	
	
	@NotNull(message = "requestLoanAmount  is required")
	private BigDecimal 	requestLoanAmount;
	
	@NotNull(message = "periodInMonths  is required")
	private Integer periodInMonths;
	
	
	@JsonIgnore
	public Long getRequestId() {
		return requestId;
	}
	
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	
	public String getNaturalId() {
		return naturalId;
	}

	public void setNaturalId(String naturalId) {
		this.naturalId = naturalId;
	}

	public BigDecimal getRequestLoanAmount() {
		return requestLoanAmount;
	}

	public void setRequestLoanAmount(BigDecimal requestLoanAmount) {
		this.requestLoanAmount = requestLoanAmount;
	}

	public Integer getPeriodInMonths() {
		return periodInMonths;
	}

	public void setPeriodInMonths(Integer periodInMonths) {
		this.periodInMonths = periodInMonths;
	}
	
	
	
}
