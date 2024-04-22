package com.example.msgestionproyectos.service;

import com.example.msgestionproyectos.entity.Proyecto;

import java.util.List;
import java.util.Optional;

public interface ProyectoService {
    public List<Proyecto> listar();
    public Proyecto guardar(Proyecto proyecto);
    public Proyecto actualizar(Proyecto proyecto);
    public Optional<Proyecto> listarPorId(Integer id);
    public void eliminarPorId(Integer id);

}