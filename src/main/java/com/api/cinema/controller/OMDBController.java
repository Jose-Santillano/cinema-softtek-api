package com.api.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//Controlador para extraer información de otra API.
@RestController
@RequestMapping("api/v1/OMDB")
public class OMDBController {

    private final RestTemplate restTemplate;

    //Inyectamos la instancia.
    @Autowired
    public OMDBController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("buscar/{nombre}")
    public Object getAPI(@PathVariable String nombre){
        String url = "https://www.omdbapi.com/?t=" + nombre + "&apikey=bf9b487a";

        return restTemplate.getForObject(url, Object.class);
    }

}
