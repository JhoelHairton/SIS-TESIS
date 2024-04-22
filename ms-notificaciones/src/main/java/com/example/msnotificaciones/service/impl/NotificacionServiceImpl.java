package com.example.msnotificaciones.service.impl;

import com.example.msnotificaciones.entity.Notificacion;
import com.example.msnotificaciones.repository.NotificacionRepository;
import com.example.msnotificaciones.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;


    @Override
    public List<Notificacion> listar() {
        return notificacionRepository.findAll();
    }

    @Override
    public Notificacion guardar(Notificacion notificacion) {
        return notificacionRepository.save(notificacion);
    }

    @Override
    public Notificacion actualizar(Notificacion notificacion) {
        return notificacionRepository.save(notificacion);
    }

    @Override
    public Optional<Notificacion> listarPorld(Integer id) {
        return notificacionRepository.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        notificacionRepository.deleteById(id);

    }
}
