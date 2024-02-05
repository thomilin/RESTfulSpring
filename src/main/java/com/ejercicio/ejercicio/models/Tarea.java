package com.ejercicio.ejercicio.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tareas")
@ToString @EqualsAndHashCode  /* @AllArgs... */
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* Autoincrementable */
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "completado")
    private Boolean completado;
}
