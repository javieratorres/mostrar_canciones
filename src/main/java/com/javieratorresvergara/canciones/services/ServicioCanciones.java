package com.javieratorresvergara.canciones.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javieratorresvergara.canciones.models.Cancion;
import com.javieratorresvergara.canciones.repositories.CancionRepositorio;

@Service
public class ServicioCanciones {
    @Autowired
    private CancionRepositorio repoCanciones;

    public List<Cancion> obtenerTodasLasCanciones() {
        return this.repoCanciones.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        return this.repoCanciones.findById(id).orElse(null);
    }
    
}
