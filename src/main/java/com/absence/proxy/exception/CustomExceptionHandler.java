package com.absence.proxy.exception;

import com.absence.proxy.dtos.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    private static final String ERROR = "error";

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> generalException(Exception e) {
        e.printStackTrace();
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ResponseDto.builder()
                        .code(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                        .status(ERROR)
                        .message("Oops, something went wrong!")
                        .build());
    }

}
