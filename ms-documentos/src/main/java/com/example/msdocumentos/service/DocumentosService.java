package com.example.msdocumentos.service;

import com.example.msdocumentos.entity.Documento;

import java.util.List;
import java.util.Optional;

public interface DocumentosService {
    public List<Documento> listar();
    public Documento guardar(Documento documento);
    public Documento actualizar(Documento documento);
    public Optional<Documento> listarPorld(Integer id);
    public void eliminarPorld(Integer id);
}
