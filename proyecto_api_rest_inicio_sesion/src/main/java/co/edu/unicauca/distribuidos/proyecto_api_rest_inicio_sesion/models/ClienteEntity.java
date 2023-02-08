package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ClienteEntity {
    
    @NotNull
    @Size(min = 5,max = 50)
    private String nombres;	
    
    @NotNull
    @Size(min = 5,max = 50)
	private String apellidos;

    @NotNull
    @Email
	private String correo;	

    @Pattern(regexp = "[5][0-9]{8}")
	private String telefono;
    
    @NotNull
    @Size(min = 10,max = 20)
	private String login;

    @NotNull
    @Size(min = 10,max = 20)
    private String contrasenia; 

    public ClienteEntity(){

    }

}
