package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class RequestException extends RuntimeException{

    private String codigo;

    public RequestException(String code, String message){
        super(message);
        this.codigo = code;
    }


}
