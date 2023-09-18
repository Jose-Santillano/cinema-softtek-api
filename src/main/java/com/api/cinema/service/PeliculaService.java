package com.api.cinema.service;

import com.api.cinema.model.Pelicula;
import com.api.cinema.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;

    //Mostrar peliculas.
    public List<Pelicula> getAllPeliculas(){
        return peliculaRepository.findAll();
    }

    //Crear pelicula.
    public Pelicula createPelicula(Pelicula pelicula){
        return peliculaRepository.save(pelicula);
    }

    //Editar pelicula.
    public Pelicula updatePelicula(Pelicula pelicula){
        return peliculaRepository.save(pelicula);
    }

    //Eliminar pelicula
    public void deletePelicula(Integer id){
        peliculaRepository.deleteById(id);
    }
}
