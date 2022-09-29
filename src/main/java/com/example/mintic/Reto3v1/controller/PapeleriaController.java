package com.example.mintic.Reto3v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mintic.Reto3v1.model.Papeleria;
import com.example.mintic.Reto3v1.service.PapeleriaService;
@RestController
@RequestMapping("/api/papeleria")
public class PapeleriaController {
    @Autowired
    private PapeleriaService papeleriaService;

    @GetMapping("/papeleriacompleta")
    public List <Papeleria> obtenerPapeleriaCompleta(){
        return papeleriaService.obtenerPapeleriaCompleta();
    }

    @GetMapping("/{nombre}/{precio}")
    public List<Papeleria> buscarPapeleriaNombreOPrecioJPQL(@PathVariable("nombre") String nombrePapeleria, @PathVariable("precio") Integer precioPapeleria){
        return papeleriaService.buscarPapeleriaNombreOPrecioJPQL(nombrePapeleria,precioPapeleria);
    }


    @PostMapping("/salvarpapeleria")
    @ResponseStatus(HttpStatus.CREATED)
    
    public Papeleria salvarPapeleria(@RequestBody Papeleria papeleria){

        return papeleriaService.salvarPapeleria(papeleria);
    }
}
