package com.springoracle.code.app.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException {

    public ModeloNotFoundException(String mensaje)
    {
        super(mensaje);
    }

}
