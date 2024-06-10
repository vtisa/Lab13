package com.tecsup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsup.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
