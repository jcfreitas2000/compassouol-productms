package com.compassouol.productms.config.errorhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ExceptionResponse {

    private final int status_code;
    private final String message;
}
