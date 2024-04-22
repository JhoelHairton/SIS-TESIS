package com.example.msgestionproyectos.controller;

import com.example.msgestionproyectos.entity.Tarea;
import com.example.msgestionproyectos.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")

public class TareaController {
    @Autowired

    private TareaService tareaService;

    @GetMapping()
    public ResponseEntity<List<Tarea>> list() {
        return ResponseEntity.ok().body(tareaService.listar());
    }
    @PostMapping()
    public ResponseEntity<Tarea> save(@RequestBody Tarea tarea){
        return ResponseEntity.ok(tareaService.guardar(tarea));
    }
    @PutMapping()
    public ResponseEntity<Tarea> update(@RequestBody Tarea tarea){
        return ResponseEntity.ok(tareaService.actualizar(tarea));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> listById(@PathVariable(required = true)Integer id){
        return ResponseEntity.ok().body(tareaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true)Integer id){
        tareaService.eliminarPorId(id);
        return "Eliminacion existosa";
    }


}
