package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.models.Tarea;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = "tarea/{id}")
    public Tarea getTarea(@PathVariable Long id) {
        Tarea tarea = new Tarea();
        tarea.setId(id);
        tarea.setNombre("Tarea1");
        tarea.setCompletado(true);
        return tarea;
    }

    /* @RequestMapping(value = "tarea12")
    public Tarea editar() {
        Tarea tarea = new Tarea();
        tarea.setId(id);
        tarea.setNombre("Tarea1");
        tarea.setCompletado(true);
        return tarea;
    }

    @RequestMapping(value = "tarea123")
    public Tarea eliminar() {
        Tarea tarea = new Tarea();
        tarea.setId(id);
        tarea.setNombre("Tarea1");
        tarea.setCompletado(true);
        return tarea;
    } */
}
