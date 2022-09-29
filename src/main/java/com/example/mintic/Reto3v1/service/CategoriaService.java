package com.example.mintic.Reto3v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Reto3v1.model.Categoria;
import com.example.mintic.Reto3v1.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerCategoriaCompleta() {
        return categoriaRepository.obtenerCategoriaCompleta();
    }

    public Categoria salvarCategoria(Categoria categoria) {
        if (categoria.getId()==null){
            return categoriaRepository.salvarCategoria(categoria);
        }
        else{
            // Optional <Categoria> categoriaAuxiliar = categoriaRepository.obtenerCategoriaId(categoria.getId());
            // if (categoriaAuxiliar.isEmpty()){
            //     return categoriaRepository.salvarCategoria(categoria);
            // }
            // else{
            //     return categoria;
            // }
            return categoria;
        }

    }

    public Optional<Categoria> obtenerCategoriaId(Integer identificador) {
        return categoriaRepository.obtenerCategoriaId(identificador);
    }

}
