package com.cursoceat.wilbby.controller;

import com.cursoceat.wilbby.model.Repartidor;
import com.cursoceat.wilbby.repository.RepartidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.LocalDate;
import java.util.ArrayList;


@Controller
public class RepartidorControlador {

    @Autowired
    private RepartidorRepository repartidorRepository;

    @GetMapping("/")
    public String index() {
        return "inicio";
    }

    @GetMapping("/crud")
    public String mostrarCrud(Model model) {
        model.addAttribute("repartidor", repartidorRepository.findAll());
        return "crud";
    }

    //Metodo que muestra el registro
    @GetMapping("/formularioRepartidor")
    public String registroRepartidor(Model model) {
        model.addAttribute("repartidor", new Repartidor());
        return "formularioRepartidor";
    }

    ArrayList<Repartidor> listaRepartidor=new ArrayList<>();
    @PostMapping("/crud")
    public String mostrarListaRepartidor(Model model, @ModelAttribute Repartidor repartidor) {
        repartidorRepository.save(repartidor);
        //mostramos fecha
        LocalDate fecha= LocalDate.now();
        repartidor.setFecha(fecha);
        //verificamos que este leyendo bien los datos
        System.out.println(repartidor);
        listaRepartidor.add(repartidor);
        model.addAttribute("repartidor",listaRepartidor);
        return "redirect:/crud";
    }

    //Metodo que muestra editar
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Repartidor repartidor = repartidorRepository.findById(id).orElse(null);
        if (repartidor == null) {
            // Maneja el error si no se encuentra el repartidor (puede ser un redirect o mensaje)
            return "redirect:/crud";
        }
        model.addAttribute("repartidor", repartidor);
        return "formularioRepartidor";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        repartidorRepository.deleteById(id);
        return "redirect:/crud";
    }
}























