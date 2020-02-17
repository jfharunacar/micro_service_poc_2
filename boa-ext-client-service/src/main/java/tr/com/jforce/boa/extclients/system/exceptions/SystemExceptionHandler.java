package tr.com.jforce.boa.extclients.system.exceptions;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tr.com.jforce.boa.extclients.system.exceptions.model.SystemErrorModel;

@ControllerAdvice(basePackages= {"tr.com.*"})
public class SystemExceptionHandler {

	private AtomicLong transactionId=new AtomicLong();
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<SystemErrorModel> handleMethodArgumentNotValidException( Exception error ) {
		
		SystemErrorModel errorModel=new SystemErrorModel();
		errorModel.setCurrentDateTime(Calendar.getInstance().getTime());
		errorModel.setId(transactionId.incrementAndGet());
		errorModel.setMessage("Error:Only for demos:"+error.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorModel);
	}
	
 
	
}
