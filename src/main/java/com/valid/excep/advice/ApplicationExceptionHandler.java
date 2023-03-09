package com.valid.excep.advice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.valid.excep.exception.UserNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidDetails(MethodArgumentNotValidException mv){
		
		Map<String, String> m = new HashMap<>();
		
		List<FieldError> f =mv.getBindingResult().getFieldErrors();
		
		for (FieldError fieldError : f) {
			
			m.put(fieldError.getField(), fieldError.getDefaultMessage());
			
		}
		
		
		return m;
		
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String, String> userHandle(UserNotFoundException uf){
		
		Map<String, String> m1 = new HashMap<>();
		
		m1.put("error message", uf.getMessage());
		
		
		return m1;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
