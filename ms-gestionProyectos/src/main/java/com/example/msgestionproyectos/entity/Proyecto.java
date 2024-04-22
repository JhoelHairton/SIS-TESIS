package com.example.msgestionproyectos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;

    private enum Estado{
        Proceso, Finalizado, Procesos
    }
    @Enumerated(EnumType.STRING)
    private Estado estado;

}
