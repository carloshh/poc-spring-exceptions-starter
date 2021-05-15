package com.github.carloshh.poc.exceptions.exception;

import io.github.wimdeblauwe.errorhandlingspringbootstarter.ResponseErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@ResponseErrorCode("POC_CODE_EXCEPTION")
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
