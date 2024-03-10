package com.Api.Productos.Controllers;

import com.Api.Productos.Models.Productos;
import com.Api.Productos.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductosControllers {


    @Autowired
    private ProductosServices productosServices;

    @PostMapping
    public ResponseEntity<?> PostProductos(@RequestBody Productos producto)
    {
        return ResponseEntity.ok(productosServices.PostProductos(producto));
    }

    @GetMapping
    public ResponseEntity<List<Productos>> GetProductos()
    {
        return ResponseEntity.ok(productosServices.GetProductos());
    }

    // http;//localhost:8080/Productos/id
    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteProductos(@PathVariable  Long id)
    {
        return ResponseEntity.ok(productosServices.DeleteProductos(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> PutProductos(@RequestBody  Productos producto, @PathVariable Long id)
    {
        return ResponseEntity.ok(productosServices.PutProductos(producto, id));
    }

}
