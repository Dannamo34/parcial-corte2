package com.corhuila.app_carrito.controller;

import com.corhuila.app_carrito.entity.Factura;
import com.corhuila.app_carrito.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaRepository repository;

    @GetMapping
    public List<Factura> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Factura create(@RequestBody Factura factura) {
        return repository.save(factura);
    }

    @PutMapping("/{id}")
    public Factura update(@PathVariable Long id, @RequestBody Factura factura) {
        factura.setId(id);
        return repository.save(factura);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
