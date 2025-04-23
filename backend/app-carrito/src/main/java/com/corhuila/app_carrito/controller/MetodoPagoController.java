package com.corhuila.app_carrito.controller;

import com.corhuila.app_carrito.entity.MetodoPago;
import com.corhuila.app_carrito.repository.MetodoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metodos-pago")
public class MetodoPagoController {

    @Autowired
    private MetodoPagoRepository repository;

    @GetMapping
    public List<MetodoPago> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public MetodoPago create(@RequestBody MetodoPago metodoPago) {
        return repository.save(metodoPago);
    }

    @PutMapping("/{id}")
    public MetodoPago update(@PathVariable Long id, @RequestBody MetodoPago metodoPago) {
        metodoPago.setId(id);
        return repository.save(metodoPago);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
