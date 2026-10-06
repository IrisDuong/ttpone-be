package com.ttpone.utils.dto.response;

import lombok.Builder;

@Builder
public record ErrorResponse(int httpErrorCode, String message, String timestamp) {

}
