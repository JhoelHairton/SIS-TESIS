package com.example.msgestionproyectos.repository;

import com.example.msgestionproyectos.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
}