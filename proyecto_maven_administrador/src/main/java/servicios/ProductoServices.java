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
import models.Administrador;
import models.Producto;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author AndreaC
 */
public class ProductoServices {

    private String endPoint;
    private Client objClientePeticiones;

    public ProductoServices() {
        this.endPoint = "http://localhost:5020/api/administrador/productos";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    //Listar Productos Activos
    public ArrayList<Producto> listarProductos() {
        ArrayList<Producto> listaProductos = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        listaProductos = objPeticion.get(new GenericType<ArrayList<Producto>>() {
        });

        return listaProductos;
    }
    
    //Listar todos los productos
    public ArrayList<Producto> listarTodosProductos() {
        ArrayList<Producto> listaProductos = null;

        WebTarget target = this.objClientePeticiones.target("http://localhost:5020/api/cliente/productos");

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        listaProductos = objPeticion.get(new GenericType<ArrayList<Producto>>() {
        });

        return listaProductos;
    }

    //Registrar producto
    public Producto registrarProducto(Producto objProductoRegistar) {
        Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint);

        Entity<Producto> data = Entity.entity(objProductoRegistar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.post(data, Producto.class);

        return objProducto;
    }

    //Consultar Producto
    public Producto consultarProductoId(Integer codigo) {
        Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint + "/" + codigo);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.get(Producto.class);

        return objProducto;
    }
    
    //Consultar producto en subasta
    
     public Producto consultarProductoEnSubasta(){
         Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target("http://localhost:5020/api/cliente/productoEnSubasta");
        
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.get(Producto.class);

        return objProducto;
    }

    //Actualizar estado producto
    public Producto actualizarProductoSubasta(Integer codigo,String estado,Producto objProductoActualizar) {
        Producto objProducto = null;

        WebTarget target = this.objClientePeticiones.target(this.endPoint + "/" + codigo+ "/" + estado);

        Entity<Producto> data = Entity.entity(objProductoActualizar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.put(data, Producto.class);

        return objProducto;
    }
    

}
