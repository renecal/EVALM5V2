package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.TipoAccidente;

@Repository
public interface TipoAccidenteRepository extends CrudRepository<TipoAccidente, Long>{

}
