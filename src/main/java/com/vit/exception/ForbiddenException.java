package com.vit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//custom exception class to throw the forbidden exception if the captcha response
//is not valid.
@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class ForbiddenException extends Exception {

    private static final long serialVersionUID = 1L;

    public ForbiddenException(final String message) {
        super(message);
    }
}
