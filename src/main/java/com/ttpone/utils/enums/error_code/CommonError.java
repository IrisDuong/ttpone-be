package com.ttpone.utils.enums.error_code;

public enum CommonError  implements HttpError{
	// 409
	DUPLICATED_DATA(409, "error.http.duplicated-data"),

	// 400
	INVALID_REQUEST(400, "error.http.invalid-request"),
	
	// 400
	VALIDATION_FAILED (400, "error.http.failed_validation"),
	
	// 404
	NOT_FOUND(404, "error.http.not-found"),
	
	// 405
	METHOD_NOT_SUPPORTED (405, "error.http.method_not_supported"),
	
	// 415
	UNSUPPORTED_MEDIA_TYPE  (415, "error.http.unsuport_media_type"),


	// 503
	SERVICE_UNAVAILABLE(503, "error.http.service-unavailable"),

	// 500
	INTERNAL_ERROR(500, "error.http.internal-server");


	private final int errorCode;
	private final String messageKey;

	private CommonError(int errorCode, String messageKey) {
		this.errorCode = errorCode;
		this.messageKey = messageKey;
	}

	@Override
	public int getErrorCode() {
		// TODO Auto-generated method stub
		return errorCode;
	}

	@Override
	public String getMessageKey() {
		// TODO Auto-generated method stub
		return messageKey;
	}

}
