package com.example.msgestiondetesis.service.impl;

import com.example.msgestiondetesis.entity.Revisiones;
import com.example.msgestiondetesis.repository.RevisionRepository;
import com.example.msgestiondetesis.service.RevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class RevisionServiceImpl implements RevisionService {
    @Autowired
    private RevisionRepository revisionRepository;
    @Override
    public List<Revisiones> lista() {
        return revisionRepository.findAll();
    }

    @Override
    public Revisiones guardar(Revisiones revisiones) {
        return revisionRepository.save(revisiones);
    }

    @Override
    public Optional<Revisiones> listarPorId(Integer idRevisiones) {
        return revisionRepository.findById(idRevisiones);
    }

    @Override
    public Revisiones actualizar(Revisiones idRevisiones) {
        return revisionRepository.save(idRevisiones);
    }

    @Override
    public void eliminar(Integer idRevisiones) {
        revisionRepository.deleteById(idRevisiones);

    }
}
