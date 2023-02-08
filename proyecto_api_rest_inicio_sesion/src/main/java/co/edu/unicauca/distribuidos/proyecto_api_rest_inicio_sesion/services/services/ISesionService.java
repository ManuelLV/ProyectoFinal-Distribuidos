package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.services;

import java.util.List;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.AdministradorDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.ClienteDTO;

public interface ISesionService {
    
    public List<ClienteDTO> findAllC();
    public List<AdministradorDTO> findAllA();			
	public ClienteDTO saveC(ClienteDTO cliente);
    public AdministradorDTO saveA(AdministradorDTO administrador);	
    public ClienteDTO findClientBySesion(String login,String contrasenia);	
    public AdministradorDTO findAdminBySesion(String login,String contrasenia);

}
