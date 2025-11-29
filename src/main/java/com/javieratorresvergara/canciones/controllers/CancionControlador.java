package com.javieratorresvergara.canciones.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javieratorresvergara.canciones.services.ServicioCanciones;


@Controller
public class CancionControlador {
    
    @Autowired
    private ServicioCanciones servicioCanciones;

    @GetMapping("/canciones")
    public String despStringlayCanciones(Model model) {
        model.addAttribute("listaCanciones", this.servicioCanciones.obtenerTodasLasCanciones());
        return "canciones.jsp";
    }

    @GetMapping("/canciones/detalle/{id}")
    public String desplegarDetalleCancion(@PathVariable("id") Long id, Model model) {
        model.addAttribute("cancion", this.servicioCanciones.obtenerCancionPorId(id));
        return "detalleCancion.jsp";
    }
    
}
