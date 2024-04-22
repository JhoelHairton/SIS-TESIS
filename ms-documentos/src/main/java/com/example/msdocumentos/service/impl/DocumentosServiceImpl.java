package com.example.msdocumentos.service.impl;

import com.example.msdocumentos.entity.Documento;
import com.example.msdocumentos.repository.DocumentoRepository;
import com.example.msdocumentos.service.DocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DocumentosServiceImpl implements DocumentosService {

    @Autowired
    private DocumentoRepository documentoRepository;


    @Override
    public List<Documento> listar() {
        return documentoRepository.findAll();
    }

    @Override
    public Documento guardar(Documento documento) {
        return documentoRepository.save(documento);
    }

    @Override
    public Documento actualizar(Documento documento) {
        return documentoRepository.save(documento);
    }

    @Override
    public Optional<Documento> listarPorld(Integer id) {
        return documentoRepository.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        documentoRepository.deleteById(id);

    }
}
