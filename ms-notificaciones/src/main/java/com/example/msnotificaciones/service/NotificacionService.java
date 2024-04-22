package com.example.msnotificaciones.service;

import com.example.msnotificaciones.entity.Notificacion;

import java.util.List;
import java.util.Optional;

public interface NotificacionService {
    public List<Notificacion> listar();
    public Notificacion guardar(Notificacion notificacion);
    public Notificacion actualizar(Notificacion notificacion);
    public Optional<Notificacion>listarPorld(Integer id);
    public void eliminarPorld(Integer id);
}
