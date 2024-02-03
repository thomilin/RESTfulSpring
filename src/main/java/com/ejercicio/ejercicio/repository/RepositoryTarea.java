package com.ejercicio.ejercicio.repository;

import com.ejercicio.ejercicio.models.Tarea;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RepositoryTarea extends JpaRepository<Tarea,Long> {
}
