package com.example.msgestiondetesis.service;

import com.example.msgestiondetesis.entity.Tesis;

import java.util.List;
import java.util.Optional;

public interface TesisService {
    List<Tesis> lista();
    Tesis guardar(Tesis tesis);
    Optional<Tesis> listarPorId(Integer idTesis);
    Tesis actualizar(Tesis tesis);
    void eliminar(Integer idTesis);
}
