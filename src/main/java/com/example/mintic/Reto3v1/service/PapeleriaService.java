package com.example.mintic.Reto3v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Reto3v1.model.Papeleria;
import com.example.mintic.Reto3v1.repository.PapeleriaRepository;

@Service
public class PapeleriaService {
    @Autowired
    private PapeleriaRepository papeleriaRepository;

    public List<Papeleria> obtenerPapeleriaCompleta() {
        return papeleriaRepository.obtenerPapeleriaCompleta();
    }

    public Papeleria salvarPapeleria(Papeleria papeleria) {
        if (papeleria.getId()==null){
            return papeleriaRepository.salvarPapeleria(papeleria);
        }
        else{

            // Optional <Papeleria> papeleriaAuxiliar = papeleriaRepository.obtenerPapeleriaId(papeleria.getId());
            // if (papeleriaAuxiliar.isEmpty()){
            //     return papeleriaRepository.salvarPapeleria(papeleria);
            // }
            // else{
            //     return papeleria;
            // }
            return papeleria;
        }

    }

    public List<Papeleria> buscarPapeleriaNombreOPrecioJPQL(String nombrePapeleria, Integer precioPapeleria) {
        return papeleriaRepository.buscarPapeleriaNombreOPrecioJPQL(nombrePapeleria, precioPapeleria);
    }
    
}
