package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Tarea {

    @RequestMapping(value = "prueba")
    public List<String> prueba() {
        return List.of("Frutas","Verduras","Carne","Agua");
    }
}
