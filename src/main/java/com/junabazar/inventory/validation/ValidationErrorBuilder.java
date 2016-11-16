package com.junabazar.inventory.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

/**
 * Created by dharihar on 16/11/2016.
 */
public class ValidationErrorBuilder {

    public static ValidationError fromBindingErrors(Errors errors) {
        ValidationError error = new ValidationError("Validation failed. " + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}