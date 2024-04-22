package com.example.msgestionproyectos.service.impl;

import com.example.msgestionproyectos.entity.Proyecto;
import com.example.msgestionproyectos.repository.ProyectoRepository;
import com.example.msgestionproyectos.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

    public class ProyectoServiceImpl implements ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> listar() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto guardar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public Proyecto actualizar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public Optional<Proyecto> listarPorId(Integer id) {
        return proyectoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        proyectoRepository.deleteById(id);

    }
}
