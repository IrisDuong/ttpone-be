package com.ttpone.utils.enums;

public enum HttpError {
	// 400
	DUPLICATED_DATA(409, "error.http.duplicated-data"),

	// 400
	INVALID_REQUEST(400, "error.http.invalid-request"),


	// 401
	UNAUTHORIZED(401, "error.http.unauthorized"),

	// 403
	FORBIDDEN(403, "error.http.forbidden"),

	// 404
	NOT_FOUND(404, "error.http.not-found"),

	// 503
	SERVICE_UNAVAILABLE(503, "error.http.service-unavailable"),

	// 500
	INTERNAL_ERROR(500, "error.http.internal-server");

	private final int errorCode;
	private final String messageKey;

	private HttpError(int errorCode, String messageKey) {
		this.errorCode = errorCode;
		this.messageKey = messageKey;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getMessageKey() {
		return messageKey;
	}
}
