package com.junabazar.config;

import com.junabazar.config.model.ErrorVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sarthakm on 11/16/16.
 */

@RestControllerAdvice
public class JunabazaarExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorVO handleException(RuntimeException ex, HttpServletRequest req){
        return new ErrorVO(ex.getMessage());
    }
}
