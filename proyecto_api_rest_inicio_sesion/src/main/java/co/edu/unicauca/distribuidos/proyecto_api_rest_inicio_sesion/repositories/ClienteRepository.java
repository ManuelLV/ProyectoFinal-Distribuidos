package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.ClienteEntity;

@Repository
public class ClienteRepository {
    
    private ArrayList<ClienteEntity> listaDeClientes;
	
	public ClienteRepository()
	{
		this.listaDeClientes= new ArrayList<ClienteEntity>();
		cargarClientes();
	}

    public List<ClienteEntity> findAll()
   {
	   System.out.println("Invocando a listar clientes");
	   return this.listaDeClientes;	
   }


   public ClienteEntity findClientBySesion(String login,String contrasenia)
   {
	   System.out.println("Invocando a consultar un cliente, para Inicio de Sesión");
       ClienteEntity objCliente=null;
		
		for (ClienteEntity cliente : listaDeClientes) {
			if(cliente.getLogin().equals(login) && cliente.getContrasenia().equals(contrasenia))
			{
				objCliente=cliente;
				break;
			}
		}
		
		return objCliente;
	}

    public ClienteEntity save(ClienteEntity cliente)	
	{
		 System.out.println("Invocando a almacenar cliente");
		 ClienteEntity objCliente=null;
		 if (this.listaDeClientes.add(cliente))
		 {
            objCliente=cliente;
		 }
		 
		 return objCliente;
	}

    private void cargarClientes()
	{
        ClienteEntity objCliente1= new ClienteEntity("Manuel","Lopez","manLopez@gmail.com","623456789","manLopez","manlopez");
        
		this.listaDeClientes.add(objCliente1);
	
	}

}
