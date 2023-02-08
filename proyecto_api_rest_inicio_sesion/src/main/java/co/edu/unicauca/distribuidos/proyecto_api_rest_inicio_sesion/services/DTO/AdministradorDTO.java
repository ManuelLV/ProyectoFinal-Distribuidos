package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AdministradorDTO {

    @NotNull(message = "{user.name.empty}")
    @Size(min = 5, max =50, message = "la cantidad de caracteres de los nombres debe estar entre 5 y 50")
    private String nombres;	
    
    @NotNull(message = "{user.lastname.empty}")
    @Size(min = 5, max =50, message = "la cantidad de caracteres de los apellidos debe estar entre 5 y 50")
	private String apellidos;	
    
    @NotNull(message = "{user.login.empty}")
    @Size(min = 10, max =20, message = "la cantidad de caracteres del login debe estar entre 10 y 20")
	private String login;

    @NotNull(message = "{user.password.empty}")
    @Size(min = 10, max =20, message = "la cantidad de caracteres de la contrasenia debe estar entre 10 y 20")
	private String contrasenia; 

    public AdministradorDTO(){
        
    }
}
