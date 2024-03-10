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
    public List<Productos> GetProductos() {
        return null;
    }

    @Override
    public String DeleteProductos(Long id) {
        return null;
    }

    @Override
    public String PostProductos(Productos producto) {
        return null;
    }

    @Override
    public String PutProductos(Productos producto, Long id) {
        return null;
    }
}
