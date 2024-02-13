package com.ejercicio.ejercicio.service;

import com.ejercicio.ejercicio.models.Tarea;
import com.ejercicio.ejercicio.repository.RepositoryTarea;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Repository
@Transactional
public class servicetareaimpl implements ServiceTarea {

    private final RepositoryTarea repositoryTarea;

    public servicetareaimpl(RepositoryTarea repositoryTarea) {
        this.repositoryTarea = repositoryTarea;
    }

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Tarea> obtenerTareas() {
        String query = "FROM Tarea";
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return repositoryTarea.save(tarea);
    }

    @Override
    public Tarea obtenerTarea(Long id) {
        return repositoryTarea.findById(id).orElseThrow(() -> {throw new RuntimeException();});
    }
    @Override
    public Tarea editarTarea(Long id, Tarea editarTarea) {
        Tarea tareaBuscada = repositoryTarea.findById(id).get();
        tareaBuscada.setNombre(editarTarea.getNombre());
        tareaBuscada.setCompletado(editarTarea.getCompletado());
        return repositoryTarea.save(tareaBuscada);
    }

    @Override
    public boolean eliminarTarea(Long id) {
        try {
            repositoryTarea.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }

    }

}
