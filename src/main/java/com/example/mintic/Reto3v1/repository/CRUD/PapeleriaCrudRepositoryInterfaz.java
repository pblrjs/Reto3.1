package com.example.mintic.Reto3v1.repository.CRUD;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.mintic.Reto3v1.model.Papeleria;

public interface PapeleriaCrudRepositoryInterfaz extends CrudRepository<Papeleria,Integer> {

    /**
     * @return
     */
    @Query ("select pap from Papeleria pap")
    public List <Papeleria> obtenerPapeleriaCompletaJPQL();

    @Query("select pap from Papeleria pap  where  pap.name=:n")   
   public List <Papeleria> buscarPapeleriaNombreJPQL(@Param("n") String  nombrePapeleria);

   @Query("select pap from Papeleria pap where pap.name=:n or pap.price=:p")
   public List <Papeleria> buscarPapeleriaNombreOPrecioJPQL(@Param("n") String nombrePapeleria , @Param("p") Integer precio);

   @Query("select count(pap) from Papeleria pap")  
   public Integer contarPapeleriaJPQL();

   public List <Papeleria> findByNameOrPrice(String nombrePapeleria,Integer precioPapeleria);

    
}
