package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.RegistroAccidente;

@Repository
public interface RegistroAccidenteRepository extends CrudRepository<RegistroAccidente, Long>{

}
