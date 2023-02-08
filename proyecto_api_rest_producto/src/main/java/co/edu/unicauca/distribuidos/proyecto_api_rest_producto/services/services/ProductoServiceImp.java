package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.models.ProductoEntity;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.repositories.ProductoRepository;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ProductoDTO;

@Service
public class ProductoServiceImp implements IProductoService{
    
    @Autowired
	private ProductoRepository servicioAccesoBaseDatos;

    @Autowired
    private ModelMapper modelMapper;

     
    @Override
    public List<ProductoDTO> findAll() {
        List<ProductoEntity> productosEntity= this.servicioAccesoBaseDatos.findAll();
		List<ProductoDTO> productosDTO=this.modelMapper.map(productosEntity, new TypeToken<List<ProductoDTO>>() {}.getType());
		return productosDTO;    
    }

	@Override
    public ProductoDTO findEnSubasta() {
        ProductoEntity productoEntity= this.servicioAccesoBaseDatos.findEnSubasta();
		ProductoDTO productoSubastadoDTO=this.modelMapper.map(productoEntity, ProductoDTO.class);
		return productoSubastadoDTO;    
    }

    @Override
    public List<ProductoDTO> findAllOfert() {
        List<ProductoEntity> productosEntity= this.servicioAccesoBaseDatos.findAllOfert();
		List<ProductoDTO> productosOfertadosDTO=this.modelMapper.map(productosEntity, new TypeToken<List<ProductoDTO>>() {}.getType());
		return productosOfertadosDTO;    
    }

    @Override
	public ProductoDTO findById(Integer codigo) {		
		ProductoEntity objProductoEntity= this.servicioAccesoBaseDatos.findById(codigo);
		ProductoDTO ProductoDTO=this.modelMapper.map(objProductoEntity, ProductoDTO.class);
		return ProductoDTO;
	}

	@Override
	public ProductoDTO findByName(String nombre) {		
		ProductoEntity objProductoEntity= this.servicioAccesoBaseDatos.findByName(nombre);
		ProductoDTO ProductoDTO=this.modelMapper.map(objProductoEntity, ProductoDTO.class);
		return ProductoDTO;
	}

	@Override
	public ProductoDTO save(ProductoDTO producto) {
		ProductoEntity ProductoEntity=this.modelMapper.map(producto, ProductoEntity.class);
		ProductoEntity objProductoEntity= this.servicioAccesoBaseDatos.save(ProductoEntity);
		ProductoDTO ProductoDTO=this.modelMapper.map(objProductoEntity, ProductoDTO.class);
		return ProductoDTO;		
	}

	@Override
	public ProductoDTO update(Integer id, ProductoDTO producto) {	
		ProductoEntity ProductoEntity=this.modelMapper.map(producto, ProductoEntity.class);	
		ProductoEntity ProductoEntityActualizado= this.servicioAccesoBaseDatos.update(id, ProductoEntity);
		ProductoDTO ProductoDTO=this.modelMapper.map(ProductoEntityActualizado, ProductoDTO.class);
		return ProductoDTO;	
	}

	@Override
	public boolean delete(Integer codigo) {
		return this.servicioAccesoBaseDatos.delete(codigo);		
	}
    
}
