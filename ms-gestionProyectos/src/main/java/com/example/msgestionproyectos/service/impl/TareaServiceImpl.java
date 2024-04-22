package com.example.msgestionproyectos.service.impl;


import com.example.msgestionproyectos.entity.Tarea;
import com.example.msgestionproyectos.repository.TareaRepository;
import com.example.msgestionproyectos.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TareaServiceImpl implements TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public List<Tarea> listar() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea guardar(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public Tarea actualizar(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public Optional<Tarea> listarPorId(Integer id) {
        return tareaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        tareaRepository.deleteById(id);

    }
}