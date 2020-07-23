package com.challenge.swiftcode.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ServiceExceptionHandler {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceExceptionHandler.class);
   
    @ExceptionHandler(value = BaseApplicationException.class)  
    public ResponseEntity<ErrorResponse> handleException(BaseApplicationException exception){ 
    	log.error("ContentService - Application has encountered some issues. Please retry again in couple minutes !",exception);
    	ErrorResponse err = new ErrorResponse();
    	if(StringUtils.isNotEmpty(exception.getErrorCode())){
    		err.setErrorCode(exception.getErrorCode());
    	} 
    	if(StringUtils.isNotEmpty(exception.getErrorMessage())){
    		err.setErrorMessage(exception.getErrorMessage());
    	} else {
    		err.setErrorMessage("Application has encountered some issues. Please retry again in couple minutes !");
    	}
    	logPrintStackTrace(exception);
    	if(exception.getStatus() != null){
    		return new ResponseEntity<ErrorResponse>(err, exception.getStatus());
    	} else {
    		return new ResponseEntity<ErrorResponse>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    	
	}  
    
    @ExceptionHandler(value = Exception.class)  
    public ResponseEntity<ErrorResponse> handleException(Exception exception){ 
    	log.error("coService - General Exception - Application has encountered some issues. Please retry again in couple minutes !",exception);
    	ErrorResponse err = new ErrorResponse();
    	logPrintStackTrace(exception);
    	err.setErrorMessage("Application has encountered some issues. Please retry again in couple minutes !");
		return new ResponseEntity<ErrorResponse>(err, HttpStatus.INTERNAL_SERVER_ERROR);
	}  
    
    private void logPrintStackTrace(Exception cause) {
		StringWriter errors = new StringWriter();
		cause.printStackTrace(new PrintWriter(errors));
		log.error(cause.toString());
	}
}


