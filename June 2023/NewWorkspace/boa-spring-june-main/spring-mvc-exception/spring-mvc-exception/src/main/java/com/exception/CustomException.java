package com.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomException {
	@ExceptionHandler(ServletRequestBindingException.class)
	public ResponseEntity<Object> handleHeaderException(Exception e, WebRequest req) {
		List<String> details = new ArrayList<String>();
		details.add(e.getLocalizedMessage());
		ErrorResponse er = new ErrorResponse("OOPS... header is missing", details);
		return new ResponseEntity(er, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception e, WebRequest req) {
		List<String> details = new ArrayList<String>();
		details.add(e.getLocalizedMessage());
		ErrorResponse er = new ErrorResponse("Server error", details);
		return new ResponseEntity(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}