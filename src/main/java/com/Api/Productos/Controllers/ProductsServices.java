package com.Api.Productos.Controllers;

import com.Api.Productos.Models.Productos;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsServices {
    public Object PostProductos(Productos producto) {
        return producto;
    }

    public List<Productos> GetProductos() {
        return null;
    }

    public Object DeleteProducts(Long id) {
        return id;
    }

    public Object PutProducts(Productos producto, Long id) {
        return producto;
    }
}
