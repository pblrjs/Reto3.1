package com.example.mintic.Reto3v1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mintic.Reto3v1.model.Papeleria;
import com.example.mintic.Reto3v1.repository.CRUD.PapeleriaCrudRepositoryInterfaz;

@Repository

public class PapeleriaRepository  {
    @Autowired
    private PapeleriaCrudRepositoryInterfaz papeleriaCrudRepositoryInterfaz;

    public List<Papeleria> obtenerPapeleriaCompleta() {
        // return (List<Papeleria>) papeleriaCrudRepositoryInterfaz.findAll();
         return (List<Papeleria>) papeleriaCrudRepositoryInterfaz.obtenerPapeleriaCompletaJPQL();
    }

    public Papeleria salvarPapeleria(Papeleria papeleria) {
        return papeleriaCrudRepositoryInterfaz.save(papeleria);
    }

    public List<Papeleria> buscarPapeleriaNombreOPrecioJPQL(String nombrePapeleria, Integer precioPapeleria) {
        return papeleriaCrudRepositoryInterfaz.buscarPapeleriaNombreOPrecioJPQL(nombrePapeleria, precioPapeleria);
    }
    
}
