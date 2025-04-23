package com.corhuila.app_carrito.repository;

import com.corhuila.app_carrito.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
