package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ProductoEntity {

    private Integer codigo;		
	private String nombre;	
	private String estado;	
	private int valor;

    public ProductoEntity()
    {

    }
}
