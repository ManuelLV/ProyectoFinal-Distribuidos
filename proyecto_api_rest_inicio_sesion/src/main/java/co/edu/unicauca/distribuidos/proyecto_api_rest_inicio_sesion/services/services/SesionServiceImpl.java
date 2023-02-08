package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.AdministradorEntity;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.ClienteEntity;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories.AdministradorRepository;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories.ClienteRepository;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.AdministradorDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.ClienteDTO;

@Service
public class SesionServiceImpl implements ISesionService{

    @Autowired
	private ClienteRepository servicioAccesoBaseDatosCliente;

    @Autowired
	private AdministradorRepository servicioAccesoBaseDatosAdministrador;
    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ClienteDTO> findAllC() {
        List<ClienteEntity> clientesEntity= this.servicioAccesoBaseDatosCliente.findAll();
		List<ClienteDTO> clientesDTO=this.modelMapper.map(clientesEntity, new TypeToken<List<ClienteDTO>>() {}.getType());
		return clientesDTO; 
    }


    @Override
    public ClienteDTO saveC(ClienteDTO cliente) {
        ClienteEntity ClienteEntity=this.modelMapper.map(cliente, ClienteEntity.class);
		ClienteEntity objClienteEntity= this.servicioAccesoBaseDatosCliente.save(ClienteEntity);
		ClienteDTO ClienteDTO=this.modelMapper.map(objClienteEntity, ClienteDTO.class);
		return ClienteDTO;	
    }

    @Override
    public ClienteDTO findClientBySesion(String login, String contrasenia) {
        ClienteEntity objClienteEntity= this.servicioAccesoBaseDatosCliente.findClientBySesion(login,contrasenia);
		ClienteDTO ClienteDTO=this.modelMapper.map(objClienteEntity, ClienteDTO.class);
		return ClienteDTO;
    }

    @Override
    public List<AdministradorDTO> findAllA() {
        List<AdministradorEntity> administradoresEntity= this.servicioAccesoBaseDatosAdministrador.findAll();
		List<AdministradorDTO> administradoresDTO=this.modelMapper.map(administradoresEntity, new TypeToken<List<AdministradorDTO>>() {}.getType());
		return administradoresDTO;
    }

    @Override
    public AdministradorDTO saveA(AdministradorDTO administrador) {
        AdministradorEntity AdministradorEntity=this.modelMapper.map(administrador, AdministradorEntity.class);
		AdministradorEntity objAdministradorEntity= this.servicioAccesoBaseDatosAdministrador.save(AdministradorEntity);
		AdministradorDTO AdministradorDTO=this.modelMapper.map(objAdministradorEntity, AdministradorDTO.class);
		return AdministradorDTO;	
    }

    @Override
    public AdministradorDTO findAdminBySesion(String login, String contrasenia) {
        AdministradorEntity objAdministradorEntity= this.servicioAccesoBaseDatosAdministrador.findAdminBySesion(login,contrasenia);
		AdministradorDTO AdministradorDTO=this.modelMapper.map(objAdministradorEntity, AdministradorDTO.class);
		return AdministradorDTO;
    }
 
}
