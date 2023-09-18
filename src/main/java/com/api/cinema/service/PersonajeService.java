package com.api.cinema.service;

import com.api.cinema.model.Personaje;
import com.api.cinema.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    //Mostrar personajes.
    public List<Personaje> getAllPersonajes(){
        return personajeRepository.findAll();
    }

    //Crear personaje.
    public Personaje createPersonaje(Personaje personaje){
        return personajeRepository.save(personaje);
    }

    //Editar personaje.
    public Personaje updatePersonaje(Personaje personaje){
        return personajeRepository.save(personaje);
    }

    //Eliminar personaje.
    public void deletePersonaje(Integer id){
        personajeRepository.deleteById(id);
    }
}
