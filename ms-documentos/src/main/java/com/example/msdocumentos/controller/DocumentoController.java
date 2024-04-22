package com.example.msdocumentos.controller;

import com.example.msdocumentos.entity.Documento;
import com.example.msdocumentos.service.DocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/documento")
public class DocumentoController {
    @Autowired
    private DocumentosService documentosService;


    @GetMapping()
    public ResponseEntity<List<Documento>> list() {
        return ResponseEntity.ok().body(documentosService.listar());
    }
    @PostMapping()
    public ResponseEntity<Documento> save(@RequestBody Documento documento){
        return ResponseEntity.ok(documentosService.guardar(documento));
    }
    @PutMapping()
    public ResponseEntity<Documento> update(@RequestBody Documento documento){
        return ResponseEntity.ok(documentosService.actualizar(documento));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Documento> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(documentosService.listarPorld(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        documentosService.eliminarPorld(id);
        return "Eliminacion Correcta";
    }
}
