package com.ttpone.utils.func;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ttpone.utils.dto.response.ApiResponse;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiUtils<T>{

	public static final String HEADER_X_REQUEST_ID = "X_REQUEST_ID";
	
	public static <T> ResponseEntity<ApiResponse<T>> buildApiResponse(T data, String message, HttpStatus httpStatus) {
		ApiResponse<T> response = ApiResponse.<T>builder()
				.data(data)
				.message(message)
				.httpStatusCode(httpStatus.value())
				.timestamp(DateUtils.getNow(false))
				.build();
		return new ResponseEntity<ApiResponse<T>>(response, httpStatus);
	}
}
