package com.example.msgestionproyectos.service;

import com.example.msgestionproyectos.entity.Tarea;

import java.util.List;
import java.util.Optional;

public interface TareaService {
    public List<Tarea> listar();
    public Tarea guardar(Tarea tarea);
    public Tarea actualizar(Tarea tarea);
    public Optional<Tarea> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
