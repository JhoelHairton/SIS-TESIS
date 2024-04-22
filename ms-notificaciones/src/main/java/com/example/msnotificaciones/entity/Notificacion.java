package com.example.msnotificaciones.entity;

import jakarta.persistence.*;
import lombok.Data;



import java.time.LocalDateTime;

@Entity
@Data
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mensaje;
    private LocalDateTime fecha_y_hora;
    private String estado;
}
