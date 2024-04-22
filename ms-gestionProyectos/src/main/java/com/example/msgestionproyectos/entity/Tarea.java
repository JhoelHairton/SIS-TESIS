package com.example.msgestionproyectos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity


public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;

    private enum Estado{
        Pendiente, Proceso, Finalizado
    }
    @Enumerated(EnumType.STRING)
    private Estado estado;






}
