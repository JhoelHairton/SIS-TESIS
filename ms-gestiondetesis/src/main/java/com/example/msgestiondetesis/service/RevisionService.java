package com.example.msgestiondetesis.service;

import com.example.msgestiondetesis.entity.Revisiones;
import com.example.msgestiondetesis.entity.Tesis;

import java.util.List;
import java.util.Optional;

public interface RevisionService {
    List<Revisiones> lista();
    Revisiones guardar(Revisiones revisiones);
    Optional<Revisiones> listarPorId(Integer idRevisiones);
    Revisiones actualizar(Revisiones idRevisiones);
    void eliminar(Integer idTesis);
}
