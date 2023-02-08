/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Administrador;

/**
 *
 * @author AndreaC
 */
public class AdministradorServices {

    private String endPoint;
    private Client objClientePeticiones;

    public AdministradorServices() {
        this.endPoint = "http://localhost:5000/api/administradores";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public Administrador consultarAdministradorByInicioSesion(String login, String contrasenia) {
        Administrador objAdministrador = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint + "/" + login + "/" + contrasenia);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objAdministrador = objPeticion.get(Administrador.class);

        return objAdministrador;
    }

    public List<Administrador> listarAdministradores() {
        List<Administrador> listaAdministradores = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        listaAdministradores = objPeticion.get(new GenericType<List<Administrador>>() {
        });

        return listaAdministradores;
    }

    public Administrador registrarAdministrador(Administrador objAdministradorRegistar) {
        Administrador objAdministrador = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Entity<Administrador> data = Entity.entity(objAdministradorRegistar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objAdministrador = objPeticion.post(data, Administrador.class);

        return objAdministrador;
    }

}
