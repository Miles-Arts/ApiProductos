package com.Api.Productos.Controllers;

import com.Api.Productos.Models.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductosControllers {


    @Autowired
    private ProductsServices productsServices;

    @PostMapping
    public ResponseEntity<?> PostProductos(@RequestBody Productos producto)
    {
        return ResponseEntity.ok(productsServices.PostProductos(producto));
    }

    @GetMapping
    public ResponseEntity<List<Productos>> GetProductos()
    {
        return ResponseEntity.ok(productsServices.GetProductos());
    }

    // http;//localhost:8080/Productos/id
    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteProductos(@PathVariable  Long id)
    {
        return ResponseEntity.ok(productsServices.DeleteProducts(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> PutProductos(@RequestBody  Productos producto, @PathVariable Long id)
    {
        return ResponseEntity.ok(productsServices.PutProducts(producto, id));
    }

}
