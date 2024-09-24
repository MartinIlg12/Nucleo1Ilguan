package com.itsqmet.canchas.repositorio;

import com.itsqmet.canchas.modelo.Chaleco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChalecoRepositorio extends CrudRepository<Chaleco, Integer> {

}
