package com.example.msgestiondetesis.service.impl;

import com.example.msgestiondetesis.entity.Tesis;
import com.example.msgestiondetesis.repository.TesisRepository;
import com.example.msgestiondetesis.service.TesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class TesisServiceImpl implements TesisService {

    @Autowired
    private TesisRepository tesisRepository;
    @Override
    public List<Tesis> lista() {
        return tesisRepository.findAll();
    }

    @Override
    public Tesis guardar(Tesis tesis) {
        return tesisRepository.save(tesis);
    }

    @Override
    public Optional<Tesis> listarPorId(Integer idTesis) {
        return tesisRepository.findById(idTesis);
    }

    @Override
    public Tesis actualizar(Tesis tesis) {
        return tesisRepository.save(tesis);
    }

    @Override
    public void eliminar(Integer idTesis) {
        tesisRepository.deleteById(idTesis);

    }
}
