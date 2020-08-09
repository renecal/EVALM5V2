package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
