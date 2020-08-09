package com.prueba.interfaceService;

import java.util.List;
import java.util.Optional;

import com.prueba.entity.Profesional;

public interface IProfesionalService {

	public List<Profesional> listarProfesional();
	public Optional<Profesional> listarProfesionalId(Long id);
	public int save (Profesional p);
	public void delete (Long id);
}
