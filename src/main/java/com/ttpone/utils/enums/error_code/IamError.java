package com.ttpone.utils.enums.error_code;

public enum IamError implements HttpError {
	// 401
	INVALID_AUTH_SECRET_KEY(401, "error.http.iam.invalid-secret-key"),

	// 401
	EXPIRED_AUTH_TOKEN(401, "error.http.iam.expired-token"),

	// 401
	INVALID_AUTH_TOKEN_FORMAT(401, "error.http.iam.invalid-token-format"),

	// 401
	INVALID_AUTH_TOKEN_SIGNATURE(401, "error.http.iam.invalid-token-signature"),

	// 401
	BAD_CREDENTIALS(401, "error.http.iam.bad-credentials"),

	// 401
	UNAUTHORIZED(401, "error.http.iam.unauthorized"),

	// 404
	USER_ACCOUNT_NOT_FOUND(404, "error.http.iam.user-account-not-found"),

	// 409
	EXISTED_USER_ACCOUNT(409, "error.http.iam.existed-user-account"),

	// 403
	LOCKED_USER_ACCOUNT(403, "error.http.iam.locked-user-account"),

	// 403
	UNVERIFIED_USER_ACCOUNT(403, "error.http.iam.unverified-user-account"),

	
	// 403
	PASSWORD_EXPIRED(403, "error.http.iam.expired-password"),
	
	// 403
	TIMED_PASSWORD_EXPIRED(403, "error.http.iam.timed-expired-password"),

	// 429
	MANY_LOGIN_REQUESTS(429, "error.http.iam.too-many-login-requests"),

	// 403
	FORBIDDEN(403, "error.http.iam.forbidden");

	private final int errorCode;
	private final String messageKey;

	private IamError(int errorCode, String messageKey) {
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
