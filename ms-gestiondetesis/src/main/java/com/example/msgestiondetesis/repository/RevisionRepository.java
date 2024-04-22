package com.example.msgestiondetesis.repository;

import com.example.msgestiondetesis.entity.Revisiones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevisionRepository extends JpaRepository<Revisiones, Integer> {
}
