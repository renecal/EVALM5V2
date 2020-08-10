package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Profesional;

@Repository
public interface ProfesionalRepository extends CrudRepository<Profesional, Long>{

}
