package com.cambalache.imageservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ImageNotFoundAdvice {

    @ResponseBody // indica que el aviso se renderiza directo en el cuerpo de la respuesta
    @ExceptionHandler(ImageNotFoundException.class) // solo dispara el aviso si ocurre un ImageNotFound
    @ResponseStatus(HttpStatus.NOT_FOUND) // setea el status HTTP 404
    String imageNotFoundHandler(ImageNotFoundException ex){
        return ex.getMessage();
    }
}
