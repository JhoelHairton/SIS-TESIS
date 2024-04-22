package com.example.msgestiondetesis.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity

public class Tesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Tesis;

    private String Titulo;
    private String Descripcion;
    private Date Fecha_inicio;
    private Date Fecha_fin;
    public enum Estado{
        En_proceso,Revisada,Aprobada,Rechazada
    }
    @Enumerated(EnumType.STRING)
    private Estado estado;


    /*@OneToOne
    @JoinColumn(name = "id_usuarios")
    private Usua revisiones;*/

}
