package com.prueba.interfaceService;

import java.util.List;
import java.util.Optional;

import com.prueba.entity.Persona;

public interface IPersonaService {

	public List<Persona> listarPersona();
	public Optional<Persona> listarPersonaId(Long id);
	public int save (Persona p);
	public void delete (Long id);
}
