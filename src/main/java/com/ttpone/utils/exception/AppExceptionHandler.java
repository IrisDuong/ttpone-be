package com.ttpone.utils.exception;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ttpone.utils.dto.response.ErrorResponse;
import com.ttpone.utils.func.DateUtils;

import lombok.RequiredArgsConstructor;

@RestControllerAdvice
@RequiredArgsConstructor
public class AppExceptionHandler {

	private final MessageSource messageSource;
	
	@ExceptionHandler(BaseException.class)
	public ResponseEntity<ErrorResponse> handleException(BaseException ex){
		String messagekey = ex.getHttpError().getMessageKey();
		String message = messageSource.getMessage(messagekey, ex.getArgs(), LocaleContextHolder.getLocale());
		
		ErrorResponse errorResponse = ErrorResponse.builder()
				.httpErrorCode(ex.getHttpError().getErrorCode())
				.message(message)
				.timestamp(DateUtils.getNow(false))
				.build();
		
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.valueOf(ex.getHttpError().getErrorCode()));
	}
}
