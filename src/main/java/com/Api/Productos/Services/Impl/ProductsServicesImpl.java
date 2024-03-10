package com.Api.Productos.Services.Impl;

import com.Api.Productos.Models.Productos;
import com.Api.Productos.Repository.ProductosRepository;
import com.Api.Productos.Services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServicesImpl implements ProductsServices {

    @Autowired
    private ProductosRepository productosRepository;


    @Override
    public List<Productos> GetProductos()
    {
        return productosRepository.findAll();
    }


    @Override
    public String DeleteProductos(Long id)
    {
        productosRepository.deleteById(id);
        return "Producto eliminado con Éxitos";
    }

    @Override
    public String PostProductos(Productos producto)
    {
        productosRepository.save(producto);
        return "Producto guardado con Éxito";
    }

    @Override
    public String PutProductos(Productos producto, Long id)
    {
       Productos productosNew = productosRepository.findById(id).get();

       if(productosNew != null)
       {
           productosNew.setNombre(producto.getNombre());
           productosNew.setPrecio(producto.getPrecio());

           productosRepository.save(productosNew);
           return "Producto Actualizado!";
       } else
       {
           return "Hubo un error";
       }
    }
}
