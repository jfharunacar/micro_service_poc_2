package tr.com.jforce.exception;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import tr.com.jforce.model.Response;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

@Override
@ResponseStatus(HttpStatus.BAD_REQUEST)
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
    final List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
    Map <String, Set<String>> errorsMap =  fieldErrors.stream().collect(
            Collectors.groupingBy(FieldError::getField,
                    Collectors.mapping(FieldError::getDefaultMessage, Collectors.toSet())
            )
    );
    Response response=new Response();
    response.setMessage(errorsMap.toString());
    response.setCode(HttpStatus.BAD_REQUEST.toString());
    return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}