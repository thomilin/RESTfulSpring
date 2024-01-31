package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.models.Tarea;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = "tarea")
    public Tarea getTarea() {
        Tarea tarea = new Tarea();
        tarea.setId(1);
        tarea.setNombre("Tarea1");
        tarea.setCompletado(true);
        return tarea;
    }
}
