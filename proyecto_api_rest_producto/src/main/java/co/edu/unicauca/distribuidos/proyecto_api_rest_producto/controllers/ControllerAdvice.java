package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.controllers;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorDTO> runtimeExceptionHandler(RuntimeException ex){
        ErrorDTO error = ErrorDTO.builder().code("Error-400").message("Objeto no encontrado").build();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
