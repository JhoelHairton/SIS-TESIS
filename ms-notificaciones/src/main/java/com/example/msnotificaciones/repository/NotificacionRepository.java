package com.example.msnotificaciones.repository;

import com.example.msnotificaciones.entity.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion,Integer> {
}
