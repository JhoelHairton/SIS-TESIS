package com.example.msgestiondetesis.controller;

import com.example.msgestiondetesis.entity.Revisiones;
import com.example.msgestiondetesis.entity.Tesis;
import com.example.msgestiondetesis.service.RevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/revision")
public class RevisionController {
    @Autowired
    private RevisionService revisionService;
    @GetMapping
    ResponseEntity<List<Revisiones>> listar(){
        return ResponseEntity.ok(revisionService.lista());
    }
    @PostMapping
    ResponseEntity<Revisiones> guardar(@RequestBody Revisiones revisiones){
        return ResponseEntity.ok(revisionService.guardar(revisiones));
    }
    @GetMapping("/{id_Revisiones}")
    ResponseEntity<Revisiones> listarPorId(@PathVariable(required = true) Integer id_Revisiones){
        return ResponseEntity.ok(revisionService.listarPorId(id_Revisiones).get());
    }
    @PutMapping
    ResponseEntity<Revisiones> actualizar(@RequestBody Revisiones revisiones){
        return ResponseEntity.ok(revisionService.actualizar(revisiones));
    }
    @DeleteMapping("/{id_Revisiones}")
    public ResponseEntity<List<Revisiones>> eliminar(@PathVariable(required = true) Integer id_Revisiones){
        revisionService.eliminar(id_Revisiones);
        return ResponseEntity.ok(revisionService.lista());
    }
}
