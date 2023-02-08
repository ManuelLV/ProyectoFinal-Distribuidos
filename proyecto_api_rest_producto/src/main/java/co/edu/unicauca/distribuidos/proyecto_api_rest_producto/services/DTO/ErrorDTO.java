package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private String code;
    private String message;
}
