package com.corhuila.app_carrito.repository;

import com.corhuila.app_carrito.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
