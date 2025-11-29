package com.javieratorresvergara.canciones.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javieratorresvergara.canciones.models.Cancion;

@Repository
public interface CancionRepositorio extends CrudRepository<Cancion, Long> {
    @Override
    List<Cancion> findAll();
}
