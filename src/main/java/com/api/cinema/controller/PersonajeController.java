package com.api.cinema.controller;

import com.api.cinema.model.Personaje;
import com.api.cinema.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService servicePj;

    //GET
    @GetMapping
    public List<Personaje> listarTodo(){
        return servicePj.getAllPersonajes();
    }

    //POST
    @PostMapping
    public Personaje crear(@RequestBody Personaje personaje){
        return servicePj.createPersonaje(personaje);
    }

    //PUT
    @PostMapping("editar/{id}")
    public Personaje actualizar(@RequestBody Personaje personaje, @PathVariable Integer id){
        personaje.setIdPersonaje(id);
        return servicePj.updatePersonaje(personaje);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Integer id){
        servicePj.deletePersonaje(id);
    }
}
