package com.example.msgestiondetesis.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Revisiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Revisiones;
    private String Comentario;
    private Date Fecha_revision;
    private enum Estado{
        Pendiente,Aprobada,Rechazada
    }
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @OneToOne
    @JoinColumn(name = "id_Tesis")
    private Tesis tesis;


}
