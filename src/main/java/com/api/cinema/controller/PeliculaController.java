package com.api.cinema.controller;

import com.api.cinema.model.Pelicula;
import com.api.cinema.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService serviceP;

    //GET
    @GetMapping
    public List<Pelicula> listarTodo(){
        return serviceP.getAllPeliculas();
    }

    //POST
    @PostMapping
    public Pelicula crear(@RequestBody Pelicula pelicula){
        return serviceP.createPelicula(pelicula);
    }

    //PUT
    @PostMapping("editar/{id}")
    public Pelicula actualizar(@RequestBody Pelicula pelicula, @PathVariable Integer id){
        pelicula.setIdPelicula(id);
        return serviceP.updatePelicula(pelicula);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Integer id){
        serviceP.deletePelicula(id);
    }

}
