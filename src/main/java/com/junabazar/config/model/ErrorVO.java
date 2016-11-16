package com.junabazar.config.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by sarthakm on 11/16/16.
 */
public class ErrorVO implements Serializable{

    private String errorMessage;
    private LocalDateTime errorTime;

    public ErrorVO(String message){
        this.errorMessage = message;
        this.errorTime = LocalDateTime.now();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }
}
