package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.AdministradorEntity;

@Repository
public class AdministradorRepository {
    
    private ArrayList<AdministradorEntity> listaDeAdministradores;
	
	public AdministradorRepository()
	{
		this.listaDeAdministradores= new ArrayList<AdministradorEntity>();
		cargarAdministrador();
	}

    public List<AdministradorEntity> findAll()
   {
	   System.out.println("Invocando a listar Administradores");
	   return this.listaDeAdministradores;	
   }

   public AdministradorEntity findAdminBySesion(String login,String contrasenia)
   {
	   System.out.println("Invocando a consultar un administrador, para Inicio de Sesión");
       AdministradorEntity objAdministrador=null;
		
		for (AdministradorEntity administrador : listaDeAdministradores) {
			if(administrador.getLogin().equals(login) && administrador.getContrasenia().equals(contrasenia))
			{
				objAdministrador=administrador;
				break;
			}
		}
		
		return objAdministrador;
	}

    public AdministradorEntity save(AdministradorEntity administrador)	
	{
		 System.out.println("Invocando a almacenar administrador");
		 AdministradorEntity objAdministrador=null;
		 if (this.listaDeAdministradores.add(administrador))
		 {
            objAdministrador=administrador;
		 }
		 
		 return objAdministrador;
	}

    private void cargarAdministrador()
	{
        AdministradorEntity objAdministrador1= new AdministradorEntity("Administrador", "Principal", "administrador", "administrador");
		this.listaDeAdministradores.add(objAdministrador1);
	
	}

}
