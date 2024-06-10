package com.tecsup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tecsup.model.Ventas;


public interface IVentasRepository extends JpaRepository<Ventas, Integer> {

}
