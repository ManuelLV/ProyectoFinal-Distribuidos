/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Cliente;
import models.Producto;

/**
 *
 * @author Manu
 */
public class ClienteServices {

    private String endPoint;
    private Client objClientePeticiones;

    public ClienteServices() {
        this.endPoint = "http://localhost:5000/api/clientes";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public Cliente consultarClienteByInicioSesion(String login, String contrasenia) {
        Cliente objCliente = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint + "/" + login + "/" + contrasenia);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objCliente = objPeticion.get(Cliente.class);

        return objCliente;
    }

    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> listaClientes = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        listaClientes = objPeticion.get(new GenericType<ArrayList<Cliente>>() {
        });

        return listaClientes;
    }

    public Cliente registrarCliente(Cliente objClienteRegistar) {
        Cliente objCliente = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Entity<Cliente> data = Entity.entity(objClienteRegistar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objCliente = objPeticion.post(data, Cliente.class);

        return objCliente;
    }

    public Producto consultarProducto(String nombre) {
        Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target("http://localhost:5020/api/cliente/productos" + "/" + nombre);
        
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.get(Producto.class);

        return objProducto;
    }
    
    public Producto consultarProductoEnSubasta(){
         Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target("http://localhost:5020/api/cliente/productoEnSubasta");
        
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.get(Producto.class);

        return objProducto;
    }
    
    //Listar Productos Activos
    public ArrayList<Producto> listarProductos() {
        ArrayList<Producto> listaProductos = null;

        WebTarget target = this.objClientePeticiones.target("http://localhost:5020/api/cliente/productos");

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        listaProductos = objPeticion.get(new GenericType<ArrayList<Producto>>() {
        });

        return listaProductos;
    }

    public Producto hacerOferta(int valorOferta, Producto objProductoAux){
        
        Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target("http://localhost:5020/api/cliente/hacerOferta" + "/" + valorOferta);

        Entity data = Entity.entity(objProductoAux, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.put(data, Producto.class);

        return objProducto;
    }
}
