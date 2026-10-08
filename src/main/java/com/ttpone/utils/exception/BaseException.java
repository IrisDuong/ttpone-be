package com.ttpone.utils.exception;

import com.ttpone.utils.enums.HttpError;

public class BaseException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final HttpError httpError;
	private final Object[] args;
	
	public BaseException(HttpError httpError, Object[] args) {
		super();
		this.httpError = httpError;
		this.args = args;
	}

	public BaseException(HttpError httpError) {
		super();
		this.httpError = httpError;
		this.args = null;
	}
	
	public HttpError getHttpError() {
		return httpError;
	}
	
	public Object[] getArgs() {
		return args;
	}
	
	
}
