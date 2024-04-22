package com.example.msgestionproyectos.controller;

import com.example.msgestionproyectos.entity.Proyecto;
import com.example.msgestionproyectos.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController{

    @Autowired

    private ProyectoService proyectoService;

    @GetMapping()
    public ResponseEntity<List<Proyecto>> list() {
        return ResponseEntity.ok().body(proyectoService.listar());
    }
    @PostMapping()
    public ResponseEntity<Proyecto> save(@RequestBody Proyecto proyecto){
        return ResponseEntity.ok(proyectoService.guardar(proyecto));
    }
    @PutMapping()
    public ResponseEntity<Proyecto> update(@RequestBody Proyecto proyecto){
        return ResponseEntity.ok(proyectoService.actualizar(proyecto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> listById(@PathVariable(required = true)Integer id){
        return ResponseEntity.ok().body(proyectoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true)Integer id){
        proyectoService.eliminarPorId(id);
        return "Eliminacion existosa";
    }


}
