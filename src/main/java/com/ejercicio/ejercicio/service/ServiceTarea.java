package com.ejercicio.ejercicio.service;

import com.ejercicio.ejercicio.models.Tarea;

import java.util.List;
import java.util.Optional;

public interface ServiceTarea {
    List<Tarea> obtenerTareas();
    Tarea guardarTarea(Tarea tarea);

    Tarea obtenerTarea(Long idTarea);

    Tarea editarTarea(Long id, Tarea editarTarea);

    boolean eliminarTarea(Long id);
}
