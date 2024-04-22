package com.example.msdocumentos.repository;

import com.example.msdocumentos.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento,Integer> {
}
