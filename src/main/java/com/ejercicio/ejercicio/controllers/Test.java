package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.models.Tarea;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "tareas")
    public List<Tarea> getTareas() {
        List<Tarea> tareas = new ArrayList<>();
        Tarea tarea = new Tarea();
        tarea.setId(1L);
        tarea.setNombre("Tarea1");
        tarea.setCompletado(true);

        Tarea tarea2 = new Tarea();
        tarea2.setId(2L);
        tarea2.setNombre("Tarea2");
        tarea2.setCompletado(false);

        Tarea tarea3 = new Tarea();
        tarea3.setId(3L);
        tarea3.setNombre("Tarea3");
        tarea3.setCompletado(true);

        tareas.add(tarea);
        tareas.add(tarea2);
        tareas.add(tarea3);
        return tareas;
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
