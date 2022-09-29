package com.example.mintic.Reto3v1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mintic.Reto3v1.model.Categoria;
import com.example.mintic.Reto3v1.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping("/categoriacompleta")
    public List<Categoria> obtenerCategoriaCompleta(){
        return categoriaService.obtenerCategoriaCompleta();
    }
    @PostMapping("/salvarcategoria")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria salvarCategoria(@RequestBody Categoria categoria){
        return categoriaService.salvarCategoria(categoria);
    }
    @GetMapping("/identificador/{id}")
    public Optional<Categoria> obtenerCategoriaId(@PathVariable("id") Integer identificador){
        return categoriaService.obtenerCategoriaId(identificador);
    }

}
