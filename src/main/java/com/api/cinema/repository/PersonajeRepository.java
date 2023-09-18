package com.api.cinema.repository;

import com.api.cinema.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {
}
