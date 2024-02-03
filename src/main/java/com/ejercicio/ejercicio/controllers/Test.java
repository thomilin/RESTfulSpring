package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.models.Tarea;
import com.ejercicio.ejercicio.service.ServiceTarea;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarea")
@RequiredArgsConstructor
public class Test {

    @Autowired
    private ServiceTarea serviceTarea;

    @RestController
    @RequestMapping("/tareas")
    public class TareaController {

        @Autowired
        private ServiceTarea serviceTarea;

        @GetMapping("/lista")
        public List<Tarea> obtenerTareas() {
            return serviceTarea.obtenerTareas();
        }
    }

    @PostMapping
    public ResponseEntity guardarTarea(@RequestBody Tarea tarea){
        return new ResponseEntity(serviceTarea.guardarTarea(tarea), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerTarea(@PathVariable("id") Long idTarea){
        return new ResponseEntity(serviceTarea.obtenerTarea(idTarea), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity editarTarea(@PathVariable("id") Long idTarea, @RequestBody Tarea tarea){
        return new ResponseEntity(serviceTarea.editarTarea(idTarea, tarea), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTarea(@PathVariable("id") Long idTarea){
        boolean respuesta = serviceTarea.eliminarTarea(idTarea);
        if (respuesta==true){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
