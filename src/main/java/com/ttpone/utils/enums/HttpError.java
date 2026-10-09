package com.ttpone.utils.enums;

public enum HttpError {
	// 400
	DUPLICATED_DATA(409, "error.http.duplicated-data"),

	// 400
	INVALID_REQUEST(400, "error.http.invalid-request"),

	// 401 - invalid secret key
	INVALID_SECRET_KEY(401, "error.http.sec.invalid-secret-key"),

	// 401 - unauthorized
	UNAUTHORIZED(401, "error.http.sec.unauthorized"),

	// 401 - expired token
	EXPIRED_TOKEN(401, "error.http.sec.expired-token"),

	// 401 - invalid token format
	INVALID_TOKEN_FORMAT(401, "error.http.sec.invalid-token-format"),

	// 401 - invalid token signature
	INVALID_TOKEN_SIGNATURE(401, "error.http.sec.invalid-token-signature"),

	// 403
	FORBIDDEN(403, "error.http.sec.forbidden"),

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
