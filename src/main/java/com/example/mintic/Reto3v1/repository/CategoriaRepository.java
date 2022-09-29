package com.example.mintic.Reto3v1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mintic.Reto3v1.model.Categoria;
import com.example.mintic.Reto3v1.repository.CRUD.CategoriaCrudRepositoyInterfaz;

@Repository

public class CategoriaRepository {
    @Autowired
    private CategoriaCrudRepositoyInterfaz categoriaCrudRepositoyInterfaz;

    public List<Categoria> obtenerCategoriaCompleta() {
        return (List<Categoria>) categoriaCrudRepositoyInterfaz.findAll();
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaCrudRepositoyInterfaz.save(categoria);
    }

    public Optional<Categoria> obtenerCategoriaId(Integer identificador) {
        return categoriaCrudRepositoyInterfaz.findById(identificador);
    }    
}
