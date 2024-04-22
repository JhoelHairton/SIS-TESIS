package com.example.msgestiondetesis.controller;

import com.example.msgestiondetesis.entity.Tesis;
import com.example.msgestiondetesis.service.TesisService;
import com.example.msgestiondetesis.repository.TesisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tesis")
public class TesisController {
    @Autowired
    private TesisService tesisService;
    @GetMapping
    ResponseEntity<List<Tesis>> listar(){
    return ResponseEntity.ok(tesisService.lista());
    }
    @PostMapping
    ResponseEntity<Tesis> guardar(@RequestBody Tesis tesis){
    return ResponseEntity.ok(tesisService.guardar(tesis));
    }
    @GetMapping("/{idTesis}")
    ResponseEntity<Tesis> listarPorId(@PathVariable(required = true) Integer idTesis){
        return ResponseEntity.ok(tesisService.listarPorId(idTesis).get());
    }
    @PutMapping
    ResponseEntity<Tesis> actualizar(@RequestBody Tesis tesis){
        return ResponseEntity.ok(tesisService.actualizar(tesis));
    }
    @DeleteMapping("/{idTesis}")
    public ResponseEntity<List<Tesis>> eliminar(@PathVariable(required = true) Integer idTesis){
        tesisService.eliminar(idTesis);
        return ResponseEntity.ok(tesisService.lista());
    }
}
