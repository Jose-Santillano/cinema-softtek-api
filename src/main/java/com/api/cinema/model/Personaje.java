package com.api.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersonaje;
    private String imagen;
    private String nombre;
    private String edad;
    private String peso;
    private String historia;

    @OneToOne
    private Pelicula pelicula;

}
